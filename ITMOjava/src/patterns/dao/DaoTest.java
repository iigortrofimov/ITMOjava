package patterns.dao;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoTest {
    public static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS User (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "login TEXT NOT NULL);";


        DriverManager.registerDriver(new JDBC());

        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:dao.db")) {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }

    public static void main(String[] args) {

    }
}