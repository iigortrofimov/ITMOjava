package patterns.dao.notnessesary;

import patterns.dao.ArticleDao;
import patterns.dao.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoFactory {
    public Connection getConnection() throws SQLException;
    public UserDao getUserDao(Connection connection);
    public ArticleDao getStudentDao(Connection connection);
}
