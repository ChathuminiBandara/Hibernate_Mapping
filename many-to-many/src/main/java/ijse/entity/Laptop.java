package ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop Table")
public class Laptop {
    @Id
    private int LapId;
    private String name;

    public Laptop(){}

    public Laptop(int lapId, String name) {
        LapId = lapId;
        this.name = name;
    }

    public int getLapId() {return LapId;}

    public void setLapId(int lapId) {LapId = lapId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}



}
