package com.project.services;

import org.springframework.stereotype.Service;

import com.project.dtos.user.AddressCreateDto;
import com.project.entities.Address;
import com.project.repositories.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {

	
	private final AddressRepo repo;
	
	
	protected AddressServiceImpl(AddressRepo repo) {
		this.repo = repo;
	    }
	
	@Override
	public AddressCreateDto one(Long id) {
		Address entity = repo.findById(id).get();
		AddressCreateDto address = new AddressCreateDto();
		address.setAccountId(entity.getId());
		address.setEstablishmentId(entity.getId());
		address.setStreetNumber(entity.getStreetNumber());
		address.setStreetName(entity.getStreetName());
		address.setCityName(entity.getCityName());
		address.setPostalCode(entity.getPostalCode());
		return address;
	}

}
