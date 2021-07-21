package lesson15.jdbc.dao;

import lesson15.jdbc.dao.model.Student;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        List<Student> allStudents = studentDao.getAllStudents();
        System.out.println(allStudents);


        Student student = new Student();
        student.setId(7);
        student.setFirstName("Jack");
        student.setLastName("Black");
        student.setDateOfBirth(LocalDate.of(1998, 10, 20));
        studentDao.createStudent(student);
        System.out.println(studentDao.getById(7));
    }
}
