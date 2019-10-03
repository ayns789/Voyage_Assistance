package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.BookingDetails;

@Repository
public interface BookingDetailsRepo extends JpaRepository<BookingDetails, Long>{

}
