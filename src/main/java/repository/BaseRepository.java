package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class BaseRepository {
    private SessionFactory sessionFactory;

    public BaseRepository() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    protected Session getCurrentSession(){
        Session session = sessionFactory.openSession();
        return session;
    }
}