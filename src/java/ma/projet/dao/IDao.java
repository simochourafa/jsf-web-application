package ma.projet.dao;

import java.util.List;

public interface IDao<T, K> {

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T getById(K id);

    List<T> getAll();
}
