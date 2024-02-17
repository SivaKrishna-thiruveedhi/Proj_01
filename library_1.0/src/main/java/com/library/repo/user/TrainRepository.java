package com.library.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Train;

public interface TrainRepository extends JpaRepository<Train, Integer> {

}
