package be.kdg.wielrennen.persist;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WielRennerDbDao implements WielRennerDao {
    private Connection connection;
    private WielRenners wielRenners;

    public WielRennerDbDao(String dbUrl) {
        wielRenners = new WielRenners();
        try {
            this.connection = DriverManager.getConnection(dbUrl);
            maakTabel();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeDb() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection = null;
            }
        }
    }

    private void maakTabel() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE wielrenners IF EXISTS");
            String create = "CREATE TABLE wielrenners (" +
                    "id INTEGER IDENTITY, " +
                    "naam VARCHAR(25) NOT NULL, " +
                    "voornaam VARCHAR(20) NOT NULL, " +
                    "nationaliteit VARCHAR(20) NOT NULL, " +
                    "geboortedatum DATE, " +
                    "lengte INTEGER, " +
                    "gewicht DOUBLE, " +
                    "ploeg VARCHAR(30), " +
                    "discipline VARCHAR(15))";
            statement.executeUpdate(create);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(WielRenner wielRenner) {
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM wielrenners WHERE id = ?")) {
            statement.setInt(1, wielRenner.getId());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                PreparedStatement updateStatement = connection.prepareStatement(
                        "UPDATE wielrenners SET naam = ?, " +
                                "voornaam = ?, " +
                                "nationaliteit = ?, " +
                                "geboortedatum = ?, " +
                                "lengte = ?, " +
                                "gewicht = ?, " +
                                "ploeg = ?, " +
                                "discipline = ? " +
                                "WHERE id = ?");
                updateStatement.setString(1, wielRenner.getNaam());
                updateStatement.setString(2, wielRenner.getVoornaam());
                updateStatement.setString(3, wielRenner.getNationaliteit());
                updateStatement.setDate(4, Date.valueOf(wielRenner.getGeboorteDatum()));
                updateStatement.setInt(5, wielRenner.getLengte());
                updateStatement.setDouble(6, wielRenner.getGewicht());
                updateStatement.setString(7, wielRenner.getPloeg());
                updateStatement.setString(8, wielRenner.getDiscipline().name());
                updateStatement.setInt(9, wielRenner.getId());
                updateStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean voegToe(WielRenner wielRenner) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO wielrenners (" +
                        "id, naam, voornaam, nationaliteit, geboortedatum, lengte, gewicht, ploeg, discipline)" +
                        "VALUES(NULL, ?,?,?,?,?,?,?,?)")) {

            statement.setString(1, wielRenner.getNaam());
            statement.setString(2, wielRenner.getVoornaam());
            statement.setString(3, wielRenner.getNationaliteit());
            statement.setDate(4, Date.valueOf(wielRenner.getGeboorteDatum()));
            statement.setInt(5, wielRenner.getLengte());
            statement.setDouble(6, wielRenner.getGewicht());
            statement.setString(7, wielRenner.getPloeg());
            statement.setString(8, wielRenner.getDiscipline().name());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean verwijder(String naam, String voornaam) {
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM wielrenners WHERE naam = ? AND voornaam = ?")) {
            statement.setString(1, naam);
            statement.setString(2, voornaam);
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public WielRenner zoek(String naam, String voornaam) {
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(
                    "SELECT * FROM wielrenners WHERE naam = '" + naam + "' AND voornaam = '" + voornaam + "'");

            if (result.next()) {
                return new WielRenner(
                        result.getInt("id"),
                        result.getString("naam"),
                        result.getString("voornaam"),
                        result.getString("nationaliteit"),
                        result.getDate("geboortedatum").toLocalDate(),
                        result.getInt("lengte"),
                        result.getDouble("gewicht"),
                        result.getString("ploeg"),
                        Discipline.valueOf(result.getString("discipline")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<WielRenner> sorteerOpNationaliteit() {
        return voerQueryUit("SELECT * FROM wielrenners ORDER BY nationaliteit ASC");
    }

    @Override
    public List<WielRenner> sorteerOpGewicht() {
        return voerQueryUit("SELECT * FROM wielrenners ORDER BY gewicht ASC");
    }

    @Override
    public List<WielRenner> sorteerOpLengte() {
        return voerQueryUit("SELECT * FROM wielrenners ORDER BY lengte ASC");
    }

    public List<WielRenner> gefilterdOp(String conditie) {
        return voerQueryUit("SELECT * FROM wielrenners WHERE " + conditie);
    }

    private List<WielRenner> voerQueryUit(String query) {
        List<WielRenner> wielrenners = new ArrayList<>();

        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                WielRenner wielRenner = new WielRenner(
                        result.getInt("id"),
                        result.getString("naam"),
                        result.getString("voornaam"),
                        result.getString("nationaliteit"),
                        result.getDate("geboortedatum").toLocalDate(),
                        result.getInt("lengte"),
                        result.getDouble("gewicht"),
                        result.getString("ploeg"),
                        Discipline.valueOf(result.getString("discipline")));
                wielrenners.add(wielRenner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.unmodifiableList(wielrenners);
    }
}
