package lesson15.jdbc.university;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBReader {
    public static final String EMPTY_STRING = "";
    private final DbConnector connector;


    public DBReader(DbConnector connector) {
        this.connector = connector;
    }

}
