package lesson15.jdbc.university;

public class UniversityApp {
    public static void main(String[] args) {
        DbConnector connector = new DbConnector();
        TableCreator tableCreator = new TableCreator(connector);

        tableCreator.createStudentTable();
        tableCreator.createModuleTable();
        tableCreator.createRegistrationTable();

        DataInsertion dataInsertion = new DataInsertion(connector);
        dataInsertion.insertStudentTable();

        System.out.println(connector.getStudentInfo("select * from student"));
    }
}
