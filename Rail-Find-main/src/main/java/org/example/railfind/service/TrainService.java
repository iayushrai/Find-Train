package org.example.railfind.service;


import org.example.railfind.Entity.Train;
import org.example.railfind.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
    public List<Train> getAllTrains() {

        return trainRepository.findAll();
    }


    public Train addTrain(Train train) {
        return this.trainRepository.save(train);


    }
}
