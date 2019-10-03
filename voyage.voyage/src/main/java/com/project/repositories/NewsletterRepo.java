package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Newsletter;

@Repository
public interface NewsletterRepo extends JpaRepository<Newsletter, Long>{

}
