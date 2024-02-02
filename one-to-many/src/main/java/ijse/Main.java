package ijse;

import ijse.config.FactoryConfiguration;
import ijse.entity.Laptop;
import ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        laptop1.setName("Huawei");
        laptop1.setLapId(001);

        laptop2.setName("Dell");
        laptop2.setLapId(002);



        Student student = new Student();
        student.setName("JK");
        student.setAge(26);
        //student.setLaptop();

        List<Laptop> laptopList = new Laptop ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.delete(laptop);
        // session.update(laptop);

        session.save(student);
        session.save(laptop1);


       /* Laptop s =  session.get(Laptop.class,1);
        Student st = session.get(Student.class,2);  */
        //Laptop s =  session.load(Laptop.class,2);

        System.out.println();
        transaction.commit();
        session.close();
    }
}