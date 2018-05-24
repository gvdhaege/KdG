package be.kdg.wielrennen.persist;

import be.kdg.wielrennen.data.Data;
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

    public void vulTabel() {

        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO wielrenners (" +
                        "id, naam, voornaam, nationaliteit, geboortedatum, lengte, gewicht, ploeg, discipline)" +
                        "VALUES(NULL, ?,?,?,?,?,?,?,?)")) {

            for (WielRenner wielRenner : Data.getData()) {
                statement.setString(1, wielRenner.getNaam());
                statement.setString(2, wielRenner.getVoornaam());
                statement.setString(3, wielRenner.getNationaliteit());
                statement.setDate(4, Date.valueOf(wielRenner.getGeboorteDatum()));
                statement.setInt(5, wielRenner.getLengte());
                statement.setDouble(6, wielRenner.getGewicht());
                statement.setString(7, wielRenner.getPloeg());
                statement.setString(8, wielRenner.getDiscipline().name());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<WielRenner> zoekTabel() {
        List<WielRenner> dbLijst = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM wielrenners");
            while (resultSet.next()) {
                WielRenner wielRenner = new WielRenner(
                        resultSet.getInt("id"),
                        resultSet.getString("naam"),
                        resultSet.getString("voornaam"),
                        resultSet.getString("nationaliteit"),
                        resultSet.getDate("geboortedatum").toLocalDate(),
                        resultSet.getInt("lengte"),
                        resultSet.getDouble("gewicht"),
                        resultSet.getString("ploeg"),
                        Discipline.valueOf(resultSet.getString("discipline")));
                dbLijst.add(wielRenner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.unmodifiableList(dbLijst);
    }

    public boolean updateTabel(WielRenner wielRenner) {
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM wielrenners WHERE id = ?")) {
            statement.setInt(1, wielRenner.getId());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                //TODO update wielrenner
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void verwijderWielrenners() {
        try (Statement statement = connection.createStatement()) {
            String delete = "DELETE FROM wielrenners";
            statement.execute(delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean voegToe(WielRenner wielRenner) {
        return wielRenners.voegToe(wielRenner);
    }

    @Override
    public boolean verwijder(String naam, String voornaam) {
        return wielRenners.verwijder(naam, voornaam);
    }

    @Override
    public WielRenner zoek(String naam, String voornaam) {
        return wielRenners.zoek(naam, voornaam);
    }

    @Override
    public List<WielRenner> sorteerOpNationaliteit() {
        return wielRenners.sorteerOpNationaliteit();
    }

    @Override
    public List<WielRenner> sorteerOpGewicht() {
        return wielRenners.sorteerOpGewicht();
    }

    @Override
    public List<WielRenner> sorteerOpLengte() {
        return wielRenners.sorteerOpLengte();
    }
}
