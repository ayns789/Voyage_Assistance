package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Activity;

@Repository
public interface ActivityRepo extends JpaRepository<Activity, Long>{

}
