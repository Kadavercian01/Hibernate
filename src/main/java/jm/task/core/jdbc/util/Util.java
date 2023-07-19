package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String user = "root";
    private static final String password = "root";

    private Util() {

    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (!connection.isClosed()) {
                return connection;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
