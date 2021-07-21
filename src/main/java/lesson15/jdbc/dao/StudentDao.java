package lesson15.jdbc.dao;

import lesson15.jdbc.dao.model.Student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private static final String URL = "jdbc:mysql://localhost:3306/development_db";
    private static final String LOGIN = "root";
    private static final String PASS = "toor";

    private static final String GET_ALL_STUDENT = "SELECT * FROM student";
    private static final String GET_BY_ID = "SELECT * FROM student WHERE student_id = ?;";
    private static final String INSERT_STUDENT = "INSERT INTO student VALUES (?, ?, ?, ?);";

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(GET_ALL_STUDENT);
            while (result.next()) {
                students.add(convertToStudent(result));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public Student getById(int id) {
        Student student = new Student();
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            PreparedStatement statement = connection.prepareStatement(GET_BY_ID);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            result.next();
            student = convertToStudent(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    private Student convertToStudent(ResultSet result) throws SQLException {
        Student student = new Student();
        student.setId(result.getInt("student_id"));
        student.setFirstName(result.getString("first_name"));
        student.setLastName(result.getString("last_name"));
        student.setDateOfBirth(result.getDate("date_of_birth").toLocalDate());

        return student;
    }

    public void createStudent(Student student) {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASS)) {
            PreparedStatement statement = connection.prepareStatement(INSERT_STUDENT);
            statement.setInt(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setDate(4, Date.valueOf(student.getDateOfBirth()));
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
