import config.FactoryConfiuguration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Query query1 = session.createQuery("from Student");
        List<Student> studentList = query1.list();


        /*Search HQL Query*/
        Query query = session.createQuery("from Student where id =1");
        query.setParameter(1,"dasd");
        Student student = (Student) query.uniqueResult();
        System.out.println(student.getName());



        Query query2 = session.createQuery("select name,address from Student where id=?1");
        query2.setParameter(1,1);
        Object[] objects = (Object[]) query2.uniqueResult();
        System.out.println(objects[0]);

        Query query3 = session.createQuery("select id,name from Student ");
        List<Object[]> List = query3.list();


      /*  String hql = "INSERT INTO Student (id, name, address) " + "SELECT id, name, address FROM Student";
        Query query = session.createQuery(hql);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);*/






        Student student1 = session.get(Student.class, 1);
        System.out.println(student1);


        transaction.commit();
        session.close();

    }
}
