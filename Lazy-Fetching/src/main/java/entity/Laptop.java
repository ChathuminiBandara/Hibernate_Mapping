package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {
    public String getLID() {
        return LID;
    }

    public void setLID(String LID) {
        this.LID = LID;
    }

    public String getLmodel() {
        return Lmodel;
    }

    public void setLmodel(String lmodel) {
        Lmodel = lmodel;
    }

    public Laptop() {
    }

    public Laptop(String LID, String lmodel) {
        this.LID = LID;
        Lmodel = lmodel;
    }

    @Id
    private String LID;
    private String Lmodel;




}
