package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.BillDetails;

@Repository
public interface BillDetailsRepo extends JpaRepository<BillDetails, Long>{

}
