package models;

import domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.Serializable;

/**
 * Created by r.pogorelov on 14.09.2016.
 */
public class UserDao {
//    @PersistenceContext
//    EntityManager entityManager;

    public static int add(User u){
        int status;

        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuration.getProperties()).buildServiceRegistry();
        Session session = configuration.buildSessionFactory(serviceRegistry).openSession();

        Transaction transaction = session.beginTransaction();
        status = (int) session.save(u);
        transaction.commit();
        session.close();

//        EntityTransaction tx = entityManager.getTransaction();
//        tx.begin();
//        entityManager.persist(u);
//        tx.commit();

        return status;
    }
}
