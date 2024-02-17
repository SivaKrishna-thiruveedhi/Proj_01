package com.library.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Station;

public interface StationRepository extends JpaRepository<Station, Integer> {

}
