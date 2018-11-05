package lesson8;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.Arrays;

public class BookHandler {
    public  static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Book (" + "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," + "title TEXT NOT NULL," +
                "pages INTEGER NOT NULL)"
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
    public static void insertIntoTable(Book book) throws SQLException {
        String sql = "INSERT INTO Book (title, pages)" +
                " VALUES (?, ?);"; // по очереди один в первую колонку, вьрой во вторую
        try(Connection connection =
                    DriverManager.getConnection("jdbc:sqlite:lesson8.db")) { // устанавливаем соединение
            PreparedStatement statement = connection.prepareStatement(sql); //
            statement.setString(1,book.getTitle());
            statement.setInt(2,book.getPages());

            int row = statement.executeUpdate(); // создание удаление 0, | если одновляет то возращает колво-строк
            // создание, удаление, изменения
            System.out.println(row);
        }
    }

            public static Book[] selectData() throws SQLException{
            //String sql = "SELECT * FROM Book WHERE id = ?;";// если все * или перечисляем
            String sql = "SELECT * FROM Book;";//
            try(Connection connection =
                        DriverManager.getConnection("jdbc:sqlite:lesson8.db")) { // устанавливаем соединение
                PreparedStatement statement = connection.prepareStatement(sql); //
          //      statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();


                Book[] books = new Book[3];
                for (int i = 0; resultSet.next(); i++){
                    Book book = new Book();
                    book.setTitle(resultSet.getString("title"));
                    book.setPages(resultSet.getInt("pages"));
                    books[i] = book;

                //  Book book = new Book();
                /*while (resultSet.next()){
                    book.setTitle(resultSet.getString("title"));
                    book.setPages(resultSet.getInt("pages"));*/
//                    String title = resultSet.getString("title");
//                    int pages = resultSet.getInt("pages");
//                    System.out.println("title " + title);
//                    System.out.println("pages " + pages);

                }
                return books;

            }
        }


    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", 1222);
        Book book2 = new Book("Война и Мир2", 1224);
        Book book3 = new Book("Война и Мир3", 1226);

        Book[] books = {book1, book2, book3};
        try {
           // BookHandler.createTable();
            //BookHandler.insertIntoTable(book3);
            //System.out.println(BookHandler.selectData(3));
            System.out.println(Arrays.toString(BookHandler.selectData()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
