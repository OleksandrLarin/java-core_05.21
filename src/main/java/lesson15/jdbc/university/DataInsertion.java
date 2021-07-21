package lesson15.jdbc.university;

public class DataInsertion {
    private final DbConnector dbCONNECTOR;

    public DataInsertion(DbConnector dbCONNECTOR) {
        this.dbCONNECTOR = dbCONNECTOR;
    }

    public void insertStudentTable() {

        String query = "INSERT INTO student VALUES (" +
                "1, " +
                "'Daniel', " +
                "'Radcliffe', " +
                "'1995-04-23'), " +

                "(" +
                "2, " +
                "'Emma', " +
                "'Watson', " +
                "'1994-07-15'), " +

                "(" +
                "3, " +
                "'Rupert', " +
                "'Grint', " +
                "'1995-10-24'" +

                ");";
        dbCONNECTOR.executeUpdate(query);

    }

}
