package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Civility;

@Repository
public interface CivilityRepo extends JpaRepository<Civility, Long>{
	
	

}
