package patterns.dao;


import java.sql.SQLException;
import java.util.List;

public interface Dao<E> {
    void add() throws SQLException;

    List<E> getAll() throws SQLException;

    E getById(int id) throws SQLException;

    void update();

    void delete();
}
