package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AddressDto;
import com.project.entities.Account;
import com.project.entities.Address;
import com.project.entities.Email;
import com.project.entities.Establishment;
import com.project.repositories.AccountRepo;
import com.project.repositories.AddressRepo;
import com.project.repositories.EstablishmentRepo;

@Service
public class AddressServiceImpl implements AddressService {

	
	private final AddressRepo addressRepo;
	
	private final AccountRepo accountRepo;
	
	private final EstablishmentRepo estaRepo;
	
	@Autowired
	private ModelMapper mapper;
	

	protected AddressServiceImpl(AddressRepo addressRepo, AccountRepo accountRepo, EstablishmentRepo estaRepo) {
		this.addressRepo = addressRepo;
		this.accountRepo = accountRepo;
		this.estaRepo = estaRepo;
		
	    }
	
	@Override
	public AddressDto one(Long id) {
		Address entity = addressRepo.findById(id).get();
		AddressDto address = new AddressDto();
		
		address.setAccountId(entity.getId());
//		address.setEstablishmentId(entity.getId());
		address.setStreetNumber(entity.getStreetNumber());
		address.setStreetName(entity.getStreetName());
		address.setCityName(entity.getCityName());
		address.setPostalCode(entity.getPostalCode());
		return address;
	}

	@Override
	public void update(Long id, AddressDto address) {
		// TODO Auto-generated method stub
		Address entity = addressRepo.findById(id).get();
		populateEntity(address, entity);
		addressRepo.save(entity);
	}
	
	private void populateEntity(AddressDto address, Address entity) {
		mapper.map(address, entity);
	    }

	@Override
	public void create(AddressDto address) {
		Account account = accountRepo.getOne(address.getAccountId());
//		Address entity = mapper.map(address, Address.class);
		Address entity = new Address();
		entity.setAccount(account);
		entity.setCityName(address.getCityName());
		entity.setStreetNumber(address.getStreetNumber());
		entity.setStreetName(address.getStreetName());
		entity.setRegion(address.getRegion());
		entity.setPostalCode(address.getPostalCode());
		entity.setCountry(address.getCountry());
		addressRepo.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		addressRepo.deleteById(id);
	}

}
