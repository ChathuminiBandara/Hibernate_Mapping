package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Laptop {
    @Id private int lid;
    private String model;
    @ManyToOne
    private  Student student;

    public Laptop() {
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop(int lid, String model, Student student) {
        this.lid = lid;
        this.model = model;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public int getLid() {
        return lid;
    }
    public Student getStudent() {
        return student;
    }



}