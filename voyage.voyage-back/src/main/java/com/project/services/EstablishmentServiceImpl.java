package com.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dtos.user.EstablishmentViewDto;
import com.project.repositories.EstablishmentRepo;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {
	
	private final EstablishmentRepo repo;
	
	protected EstablishmentServiceImpl(EstablishmentRepo repo) {
		this.repo = repo;
	    }
	
	@Override
	public List<EstablishmentViewDto> getAll() {
		return repo.getAllProjectBy();
	}
	
	@Override
	public EstablishmentViewDto getOne(Long id) {
		return repo.getById(id);
		}

}
