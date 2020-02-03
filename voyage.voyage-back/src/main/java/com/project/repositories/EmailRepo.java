package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Email;

@Repository
public interface EmailRepo extends JpaRepository<Email, Long>{

}
