package lesson8;

import org.sqlite.JDBC;

import java.sql.*;

public class JDBCExample {

    //создать таблицу
    public  static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Example (" + "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "firstColumn TEXT NOT NULL," +
                "secondColumn INTEGER NOT NULL)"
                ; // создаем если еще не создана
        // PRIMARY KEY по нему осущ поиск

        // регистрируем драйвер
        DriverManager.registerDriver(new JDBC());

        try(Connection connection =
                    DriverManager.getConnection("jdbc:sqlite:lesson8.db")) { // устанавливаем соединение
            Statement statement = connection.createStatement(); // "выражение"
            int row = statement.executeUpdate(sql); // создание удаление 0, | если одновляет то возращает колво-строк
            // создание, удаление, изменения
            System.out.println(row);
        }
    }
    //вставить данные в таблицу

    public static void insertIntoTable() throws SQLException {
        String sql = "INSERT INTO Example (firstColumn, secondColumn)" +
                " VALUES ('Value1', 123);"; // по очереди один в первую колонку, вьрой во вторую
        try(Connection connection =
                    DriverManager.getConnection("jdbc:sqlite:lesson8.db")) { // устанавливаем соединение
            Statement statement = connection.createStatement(); // "выражение"
            int row = statement.executeUpdate(sql); // создание удаление 0, | если одновляет то возращает колво-строк
            // создание, удаление, изменения
            System.out.println(row);
        }
    }

    //получить данные из таблицы

    public static void selectData() throws SQLException {
        String sql = "SELECT * FROM Example;";// если все * или перечисляем
        try(Connection connection =
                    DriverManager.getConnection("jdbc:sqlite:lesson8.db")) { // устанавливаем соединение
            Statement statement = connection.createStatement(); // "выражение"
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String str = resultSet.getString("firstColumn");
                int i = resultSet.getInt("secondColumn");
                System.out.println("str " + str);
                System.out.println("i " + i);
            }

        }
    }
    public static void main(String[] args) {
        try {
           //JDBCExample.createTable();
           // JDBCExample.insertIntoTable();
            JDBCExample.selectData();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
