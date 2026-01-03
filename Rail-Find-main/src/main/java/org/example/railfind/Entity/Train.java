package org.example.railfind.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long  id;
    private String Trainname;
    private String Trainnumber;

    public Train() {

    }

    public Train(Long id, String trainname, String trainnumber, List<TrainSchedule> trainSchedules) {
        this.id = id;
        Trainname = trainname;
        Trainnumber = trainnumber;
        TrainSchedules = trainSchedules;
    }

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)

    private List<TrainSchedule> TrainSchedules;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainname() {
        return Trainname;
    }

    public void setTrainname(String trainname) {
        Trainname = trainname;
    }

    public String getTrainnumber() {
        return Trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        Trainnumber = trainnumber;
    }

    public List<TrainSchedule> getTrainSchedules() {
        return TrainSchedules;
    }

    public void setTrainSchedules(List<TrainSchedule> trainSchedules) {
        TrainSchedules = trainSchedules;
    }
}

