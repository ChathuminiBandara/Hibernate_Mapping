package config;

import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiuguration {
    private  static FactoryConfiuguration instance;
    private SessionFactory sessionFactory;
    private FactoryConfiuguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        sessionFactory= configuration.buildSessionFactory();
    }
    public static FactoryConfiuguration getInstance(){
        if(instance==null){
            instance=new FactoryConfiuguration();
        }
        return instance;
    }
    public Session getSession(){
        return sessionFactory.openSession();

    }
}
