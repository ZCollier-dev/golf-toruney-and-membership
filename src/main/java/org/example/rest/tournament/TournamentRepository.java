package org.example.rest.tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Calendar;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    Tournament findByStartDate(Calendar startDate);
    Tournament findByLocation(String location);
}
