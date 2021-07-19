package lesson15.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

    private static final String URL = "jdbc:mysql://localhost:3306/development_db";
    private static final String LOGIN = "root";
    private static final String PASS = "toor";


    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            Statement statement = connection.createStatement();
            ResultSet show_databases = statement.executeQuery("SHOW DATABASES");
            while (show_databases.next()) {
                System.out.println(show_databases.getString("Database"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
