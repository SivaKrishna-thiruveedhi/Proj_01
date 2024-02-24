package com.library.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	
//	public void findByStation ();
}













































