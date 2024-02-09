package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    private String StudentID;
    private String StudentName;

    @OneToMany
    private Laptop laptop;

    public Student(String studentID, String studentName, Laptop laptop) {
        StudentID = studentID;
        StudentName = studentName;
        this.laptop = laptop;
    }

    public Student() {
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
