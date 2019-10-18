package com.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.dtos.user.EstablishmentViewDto;
import com.project.entities.Establishment;

@Repository
public interface EstablishmentRepo extends JpaRepository<Establishment, Long>{
	
    EstablishmentViewDto getById(Long id);
	
	List<EstablishmentViewDto> getAllProjectBy();

}
