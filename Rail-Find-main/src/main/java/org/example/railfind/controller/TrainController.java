package org.example.railfind.controller;


import org.example.railfind.Entity.Train;
import org.example.railfind.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Trains")
@CrossOrigin
public class TrainController {



    private  TrainService trainService;
    TrainController(TrainService trainService) {
     this.trainService = trainService;
    }
   @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train )
    {
        return this.trainService.addTrain(train);
    }

}
