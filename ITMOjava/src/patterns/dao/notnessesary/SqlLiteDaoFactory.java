package patterns.dao.notnessesary;

import org.sqlite.JDBC;
import patterns.dao.ArticleDao;
import patterns.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqlLiteDaoFactory implements DaoFactory {
    public SqlLiteDaoFactory() throws SQLException {
        DriverManager.registerDriver(new JDBC());
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:dao.db");
    }

    @Override
    public UserDao getUserDao(Connection connection) {
        return null;
    }

    @Override
    public ArticleDao getStudentDao(Connection connection) {
        return null;
    }


}