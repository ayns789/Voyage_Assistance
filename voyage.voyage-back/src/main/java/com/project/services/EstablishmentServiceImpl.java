package com.project.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.admin.EstablishmentCreateDto;
import com.project.dtos.user.EstablishmentViewDto;
import com.project.entities.Establishment;
import com.project.repositories.EstablishmentRepo;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {
	
	private final EstablishmentRepo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected EstablishmentServiceImpl(EstablishmentRepo repo) {
		this.repo = repo;
	    }
	
	private void populateEntity(EstablishmentCreateDto establishment, Establishment entity) {
		mapper.map(establishment, entity);
	    }
	
	@Override
	public List<EstablishmentViewDto> getAll() {
		return repo.getAllProjectBy();
	}
	
	@Override
	public EstablishmentViewDto getOne(Long id) {
		return repo.getById(id);
		}

	@Override
	public void create(EstablishmentCreateDto establishment) {
		Establishment entity = mapper.map(establishment, Establishment.class);
		repo.save(entity);
		
	}

	@Override
	public EstablishmentCreateDto one(Long id) {
		Establishment entity = repo.findById(id).get();
		EstablishmentCreateDto establishment = new EstablishmentCreateDto();
		establishment.setName(entity.getName());
		establishment.setAddress(entity.getAddress());
		establishment.setCapacity(entity.getCapacity());
		establishment.setCategory(entity.getCategory());
		establishment.setDescriptive(entity.getDescriptive());
		return establishment;
	}

	@Override
	public void update(Long id, EstablishmentCreateDto establishment) {
		// TODO Auto-generated method stub
		Establishment entity = repo.findById(id).get();
		populateEntity(establishment, entity);
		repo.save(entity);
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

}
