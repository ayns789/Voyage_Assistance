package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.user.AddressDto;
import com.project.entities.Account;
import com.project.entities.Address;
import com.project.repositories.AccountRepo;
import com.project.repositories.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {

	
	private final AddressRepo addressRepo;
	
	private final AccountRepo accountRepo;	
	
	@Autowired
	private ModelMapper mapper;
	
	protected AddressServiceImpl(AddressRepo addressRepo, AccountRepo accountRepo) {
		this.addressRepo = addressRepo;
		this.accountRepo = accountRepo;
		
	    }
	
	@Override
	public void create(AddressDto address) {
		Account account = accountRepo.getOne(address.getAccountId());
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

	private void populateEntity(AddressDto address, Address entity) {
		mapper.map(address, entity);
	}
	
	@Override
	public void update(Long id, AddressDto address) {
		// TODO Auto-generated method stub
		Address entity = addressRepo.findById(id).get();
		populateEntity(address, entity);
		addressRepo.save(entity);
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		addressRepo.deleteById(id);
	}
}
