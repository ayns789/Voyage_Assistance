package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Long>{

}
