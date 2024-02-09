import config.FactoryConfiuguration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, 1);
        System.out.println(student);


        transaction.commit();
        session.close();

    }
}
