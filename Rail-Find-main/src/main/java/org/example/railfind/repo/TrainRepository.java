package org.example.railfind.repo;

import org.example.railfind.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
}
