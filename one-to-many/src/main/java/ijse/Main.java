package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setName("Huawei");
        laptop.setLapId(002);

        Student student = new Student();
        student.setName("AAAAA");
        student.setSchool("KR.Soul");
        student.setAge(26);
        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.delete(laptop);
        // session.update(laptop);
        session.save(student);
        session.save(laptop);


       /* Laptop s =  session.get(Laptop.class,1);
        Student st = session.get(Student.class,2);
*/
        //Laptop s =  session.load(Laptop.class,2);

        System.out.println();
        transaction.commit();
        session.close();
    }
}