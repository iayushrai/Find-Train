package org.example.railfind.controller;


import org.example.railfind.Entity.Station;
import org.example.railfind.Entity.Train;
import org.example.railfind.Entity.TrainSchedule;
import org.example.railfind.repo.StationRepository;
import org.example.railfind.repo.TrainRepository;
import org.example.railfind.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class Test {
 @Autowired
 StationRepository stationRepository;
   @Autowired
  TrainRepository trainRepository;
    @Autowired
   TrainScheduleRepository trainScheduleRepository;
    @GetMapping
    public void test()
    {
        Station delhi = new Station(null, "New Delhi", "NDLS");
        Station mumbai = new Station(null, "Mumbai Central", "MMCT");
        Station chennai = new Station(null, "Chennai Central", "MAS");
        Station kolkata = new Station(null, "Howrah Junction", "HWH");
        Station bangalore = new Station(null, "Bengaluru City", "SBC");
        Station hyderabad = new Station(null, "Hyderabad Deccan", "HYB");
        Station lucknow = new Station(null, "Lucknow Charbagh", "LKO");
        Station patna = new Station(null, "Patna Junction", "PNBE");
        Station jaipur = new Station(null, "Jaipur Junction", "JP");
        Station kanpur = new Station(null, "Kanpur Central", "CNB");

        stationRepository.saveAll(List.of(
                delhi, mumbai, chennai, kolkata, bangalore,
                hyderabad, lucknow, patna, jaipur, kanpur
        ));

        Train rajdhani = new Train(null, "Rajdhani Express", "12305", null);
        Train shatabdi = new Train(null, "Shatabdi Express", "12001", null);
        Train duronto = new Train(null, "Duronto Express", "12269", null);
        Train garibRath = new Train(null, "Garib Rath Express", "12909", null);
        Train suvidha = new Train(null, "Suvidha Express", "82653", null);
        Train vivek = new Train(null, "Vivek Express", "15906", null);
        Train satabdi = new Train(null, "Satabdi Express", "12239", null);
        Train tejas = new Train(null, "Tejas Express", "22671", null);
        Train hwhRajdhani = new Train(null, "Howrah Rajdhani", "12301", null);
        Train humsafar = new Train(null, "Humsafar Express", "12571", null);
        List<Train> dumbb = List.of(
                rajdhani, shatabdi, duronto, garibRath, suvidha,
                vivek, satabdi, tejas, hwhRajdhani, humsafar
        );

        trainRepository.saveAll(dumbb);

        // TrainSchedule objects
        TrainSchedule sc1 = new TrainSchedule(null, "06:00", "14:00", rajdhani, delhi, mumbai);
        TrainSchedule sc2 = new TrainSchedule(null, "07:00", "17:00", shatabdi, mumbai, chennai);
        TrainSchedule sc3 = new TrainSchedule(null, "08:30", "21:00", duronto, kolkata, bangalore);
        TrainSchedule sc4 = new TrainSchedule(null, "10:00", "02:00", garibRath, hyderabad, lucknow);
        TrainSchedule sc5 = new TrainSchedule(null, "05:00", "18:00", suvidha, patna, delhi);
        TrainSchedule sc6 = new TrainSchedule(null, "09:15", "23:45", vivek, chennai, jaipur);
        TrainSchedule sc7 = new TrainSchedule(null, "12:00", "19:00", satabdi, jaipur, kanpur);
        TrainSchedule sc8 = new TrainSchedule(null, "14:45", "17:30", tejas, kanpur, lucknow);
        TrainSchedule sc9 = new TrainSchedule(null, "16:00", "10:00", hwhRajdhani, kolkata, delhi);
        TrainSchedule sc10 = new TrainSchedule(null, "18:00", "04:30", humsafar, bangalore, hyderabad);


// Put all in a list


// Save all using repository
        trainScheduleRepository.saveAll( List.of(
                sc1, sc2, sc3, sc4, sc5,
                sc6, sc7, sc8, sc9, sc10
        ));

    }

}
