package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long>{

}
