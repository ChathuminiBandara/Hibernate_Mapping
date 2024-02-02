package ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop Table")
public class Laptop {
    @Id
    private int LapId;
    private String name;
    @ManyToOne
    private Student student;
    public Laptop(int lapId, String name, Student student) {
        LapId = lapId;
        this.name = name;
        this.student = student;
    }
    public Laptop() {}


    public int getLapId() {
        return LapId;
    }

    public void setLapId(int lapId) {
        LapId = lapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
