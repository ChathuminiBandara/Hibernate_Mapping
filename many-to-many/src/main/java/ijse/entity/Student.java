package ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    private String name;
    private int age;
    private String school;
    @ManyToMany
    private List<Laptop> laptop;

    public Student (){}

    public Student(String name, int age, String school, Laptop laptop) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }


}

