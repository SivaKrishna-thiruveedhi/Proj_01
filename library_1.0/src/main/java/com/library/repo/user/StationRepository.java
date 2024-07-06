package com.library.repo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

	Optional<Station> findByStationName(String startingStationName);

}













































