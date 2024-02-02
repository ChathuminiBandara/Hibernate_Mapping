package ijse.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    private String name;
    private int age;

    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;

    public Student() {}

    public Student(String name, int age, List<Laptop> laptop) {
        this.name = name;
        this.age = age;
        this.laptop = laptop;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

   }


