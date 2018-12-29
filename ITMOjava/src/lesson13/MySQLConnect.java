package lesson13;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnect {
    static String connectionUrl = "jdbc:mysql://localhost:3306/courses?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; //если на своем компьютере
    static String user = "admin";
    static String password = "root";



    // all methods will use connection with base
    // формирование запросов через statement и prepareStatement смотрите в Lesson8

    // registration driver
    public static void voidForUsingDB() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        // open connection
        try (Connection connection =
                     DriverManager.getConnection(connectionUrl, user, password)) {
            // any actions with base
        }
    }

    public static void createDB(){
        String sql = "select teacher.name, subject.title, subject.price from teacher inner join subject on teacher.id = subject.teacher_id";

        //try()
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        voidForUsingDB();

    }
}