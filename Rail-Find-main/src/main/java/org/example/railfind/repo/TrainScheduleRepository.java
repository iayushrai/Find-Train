package org.example.railfind.repo;

import org.example.railfind.Entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrainScheduleRepository  extends JpaRepository<TrainSchedule, Long> {
    List<TrainSchedule> findBySource_StationCodeAndDestination_StationCode(String sourcecode, String destinationcode);

    List<TrainSchedule> findBySource_StationNameAndDestination_StationName(String sourceName, String destinationName);
}
