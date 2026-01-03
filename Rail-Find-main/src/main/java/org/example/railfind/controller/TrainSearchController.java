package org.example.railfind.controller;


import jakarta.persistence.GeneratedValue;
import org.example.railfind.Entity.TrainSchedule;
import org.example.railfind.service.TrainSearch;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class TrainSearchController {
     TrainSearch trainSearch;
    public TrainSearchController(TrainSearch trainSearch) {
        this.trainSearch = trainSearch;
    }
    @GetMapping("/by-code")
    public List<TrainSchedule>findTrainByStationCode(@RequestParam String sourcecode,@RequestParam String destinationcode)
    {
        return trainSearch.findTrainByStationCode(sourcecode.toUpperCase(),destinationcode.toUpperCase());
    }
     @GetMapping("/byname")
    public List<TrainSchedule>findTrainByStationname(@RequestParam String sourcename,@RequestParam String destinationname)
    {
        return trainSearch.findTrainByStationname(sourcename.toUpperCase(),destinationname.toUpperCase());
    }
}
