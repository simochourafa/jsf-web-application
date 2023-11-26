package ma.projet.service;

import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;



public abstract class AbstractFacade<T> {
    
     // Les classes concrètes devront implémenter cette méthode pour fournir la classe d'entité spécifique
    protected abstract Class<T> getEntityClass();

    // Utilisez cette méthode pour obtenir le nom de la classe d'entité (pour la requête HQL)
    private String getEntityClassName() {
        return getEntityClass().getSimpleName();
    }

    public boolean create(T o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    public boolean update(T o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    public boolean delete(T o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        return true;
    }

    public T getById(int id) {
        T entity = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        entity = (T) session.get(getEntityClass(), id);
        session.getTransaction().commit();
        return entity;
    }

    public List<T> getAll() {
        List<T> entities = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        entities = session.createQuery("from " + getEntityClassName()).list();
        session.getTransaction().commit();
        return entities;
    }

   
}
