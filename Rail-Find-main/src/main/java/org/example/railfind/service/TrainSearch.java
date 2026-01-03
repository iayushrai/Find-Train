package org.example.railfind.service;


import org.example.railfind.Entity.TrainSchedule;
import org.example.railfind.repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearch {

    private TrainScheduleRepository trainScheduleRepository;

    public TrainSearch(TrainScheduleRepository trainScheduleRepository) {
        this.trainScheduleRepository = trainScheduleRepository;
    }


    public  List<TrainSchedule> findTrainByStationCode(String sourceCode, String destinationCode) {
        return trainScheduleRepository.findBySource_StationCodeAndDestination_StationCode(sourceCode,destinationCode);
    }

    public  List<TrainSchedule> findTrainByStationname(String sourceName, String destinationName) {
        return trainScheduleRepository.findBySource_StationNameAndDestination_StationName(sourceName,destinationName);
    }
}
