package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AddressCreateDto;
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
	public AddressCreateDto one(Long id) {
		Address entity = addressRepo.findById(id).get();
		AddressCreateDto address = new AddressCreateDto();
		address.setAccountId(entity.getId());
//		address.setEstablishmentId(entity.getId());
		address.setStreetNumber(entity.getStreetNumber());
		address.setStreetName(entity.getStreetName());
		address.setCityName(entity.getCityName());
		address.setPostalCode(entity.getPostalCode());
		return address;
	}

	@Override
	public void updateAddress(Long id, AddressCreateDto address) {
		// TODO Auto-generated method stub
		
	}
	
	private void populateEntity(AddressCreateDto address, Address entity) {
		mapper.map(address, entity);
//		entity.setFirstName(account.getFirstName());
//		entity.setLastName(account.getLastName());
//		entity.setLogin(account.getLogin());
//		entity.setPassword(account.getPassword());
//		entity.setCivility(account.getCivility());
	    }

	@Override
	public void create(AddressCreateDto address) {
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

}
