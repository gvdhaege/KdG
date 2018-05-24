package jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * Deze code is niet ideaal, want alles in de main :-(
 * Voorlopig maken we nog geen gebruik van het DAO-pattern!
 * Want de bedoeling is om de verschillende stappen duidelijk te maken,
 * nodig voor het werken met JDBC
 */
public class JDBCDemo {
	private static Logger logger = Logger.getLogger("jdbcdemo.JDBCDemo");
private static String url = "jdbc:hsqldb:file:data/studenten"; // HSQL local
//private static String url = 	jdbc:hsqldb:hsql://localhost/studenten; // HSQL server
//private static String url = "jdbc:derby:data/studenten;create=true"; // JavaDB file
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        PreparedStatement prep = null;
        try {
            /* STAP 0. Registreer JDBC driver, niet meer nodig sinds java 7 / JDBC 4.1
					try {
						Class.forName("org.hsqldb.jdbcDriver");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}*/

					// STAP 1. Maak een verbinding met de database
            connection = DriverManager.getConnection(
            	url,
	            "sa", "sa");

            // STAP 2. Maak een SQL-query en voer die uit
            statement = connection.createStatement();
	        try {
		        statement.execute("DROP TABLE IF EXISTS studenten");
	        } catch (SQLException e) {
		        // negeer fout abij DROP
	        }
	        String createQuery = "CREATE TABLE studenten " +
		        "(id INTEGER IDENTITY," +
		        "naam VARCHAR(30) NOT NULL," +
		        "score DOUBLE)";
            statement.execute(createQuery);
	        // 3B Nieuw record toevoegen (merk op: NULL voor id, want PK wordt automatisch gegenereerd)
	        int rowsAffected = statement.executeUpdate(
		        "INSERT INTO studenten VALUES (NULL, 'Kasper', 68.5)");
	        // 3C Nog 2 records toevoegen, deze keer gebruiken we een PreparedStatement:

	        prep = connection.prepareStatement(
                    "INSERT INTO studenten(naam,score)VALUES (?,?)");


	        prep.setString(1,"Melchior");
            prep.setDouble(2,54.8);
            rowsAffected += prep.executeUpdate();
            prep.setString(1,"Balthazar");
            prep.setDouble(2,44.4);
            rowsAffected += prep.executeUpdate();
            logger.log(INFO,"rowsAffected: {0}" , rowsAffected);

            // STAP 4. Verwerk de opgehaalde data
            List<Student> myList = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM studenten");
            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("naam"),
                        resultSet.getDouble("score"));
                myList.add(student);
            }
            System.out.println("opgehaalde data:");
            System.out.println(myList);
        } catch (SQLException e) {
            logger.severe(() -> String.format("SQLException: %s \n SQLState: %s \n Error code: "
	            + "%d", e.getMessage(), e.getSQLState(), e.getErrorCode()));
            e.printStackTrace();
        } finally {
            // STAP 5. Verbreek de verbinding met de database
            try {
                if (statement != null) statement.close();
                if (prep != null) prep.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
OUTPUT:
rowsAffected: 3
opgehaalde data:
[  0 Kasper               68,5,   1 Melchior             54,8,   2 Balthazar            44,4]
 */

