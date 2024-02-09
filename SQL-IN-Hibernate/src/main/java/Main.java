import config.FactoryConfiuguration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM Student");
        nativeQuery.addEntity(Student.class);

        List<Student> StudentList = nativeQuery.list();

        Student student = session.get(Student.class, 1);
        System.out.println(student);


        transaction.commit();
        session.close();

    }
}
