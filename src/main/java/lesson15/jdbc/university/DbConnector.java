package lesson15.jdbc.university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/development_db";
    private static final String LOGIN = "root";
    private static final String PASS = "toor";

    public String getStudentInfo(String query) {
        ResultSet resultSet;

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            StringBuilder builder = new StringBuilder("Results: \n");
            while (resultSet.next()) {
                buildLine(resultSet, builder);
            }
            return builder.toString();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    private void buildLine(ResultSet resultSet, StringBuilder builder) throws SQLException {
        builder.append("Name: ")
                .append(resultSet.getString("first_name"))
                .append(" ")
                .append(resultSet.getString("last_name"))
                .append(" Date Of Birth: ")
                .append(resultSet.getDate("date_of_birth"))
                .append("\n");
    }

    public void executeUpdate(String query) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Execute Update: " + e.getMessage());
        }
    }
}
