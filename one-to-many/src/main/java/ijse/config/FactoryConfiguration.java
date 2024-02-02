package ijse.config;

import ijse.entity.Laptop;
import ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration instance;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        sessionFactory=configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance() {
        if (instance == null) {
            instance = new FactoryConfiguration();
        }
        return instance;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
