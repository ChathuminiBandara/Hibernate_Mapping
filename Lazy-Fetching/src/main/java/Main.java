import config.FactoryConfiuguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    Laptop laptop = new Laptop();
    laptop.setLID("001");
    laptop.setLmodel("Huawei");

    Student student = new Student();

    student.setStudentID("AAAAA");
    student.setStudentName("KR.Soul");
    student.setLaptop(laptop);

    //List <Laptop> LaptopList = student.getLaptop();

    //Student student = session.getSession();

    Session session = FactoryConfiuguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();

    session.save(student);
    session.save(laptop);

     transaction.commit();
     session.close();

     }
}
