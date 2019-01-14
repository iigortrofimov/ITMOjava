package patterns.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {
    private final Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add() throws SQLException {
        String insert = "INSERT INTO User (id, login) VALUES (?, ?);";
//        try (Connection connection =
//                     DriverManager.getConnection("jdbc:sqlite:dao.db")) {
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(insert);
        System.out.println(row);
    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> userList = new ArrayList<>();
        String getAll = "SELECT * FROM User;";
//        try (Connection connection =
//                     DriverManager.getConnection("jdbc:sqlite:dao.db")) {
        try (PreparedStatement statement = connection.prepareStatement(getAll)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setLogin(resultSet.getString("login"));
                userList.add(user);
            }
            return userList;
        }
    }

    @Override
    public User getById(int id) throws SQLException {
        List<User> userList;
        String getById = "SELECT * FROM User WHERE id=?;";
        try (PreparedStatement statement = connection.prepareStatement(getById)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
//            ........


            return null;
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
