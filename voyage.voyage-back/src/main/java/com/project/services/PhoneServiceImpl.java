package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.user.PhoneDto;
import com.project.entities.Account;
import com.project.entities.Phone;
import com.project.repositories.AccountRepo;
import com.project.repositories.PhoneRepo;

@Service
public class PhoneServiceImpl implements PhoneService {
	
	private final PhoneRepo phoneRepo;
	
	private final AccountRepo accountRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected PhoneServiceImpl(PhoneRepo phoneRepo, AccountRepo accountRepo) {
		this.phoneRepo = phoneRepo;
		this.accountRepo = accountRepo;
	}
	
	private void populateEntity(PhoneDto phone, Phone entity) {
		mapper.map(phone, entity);
	    }

	@Override
	public void create(PhoneDto phone) {
		// TODO Auto-generated method stub
		Account account = accountRepo.getOne(phone.getAccountId());
		Phone entity = new Phone();
		entity.setAccount(account);
		entity.setPhoneType(phone.getPhoneType());
		entity.setNumPhone(phone.getNumPhone());
//		entity.setProfessional(phone.get);
		phoneRepo.save(entity);
	}

	@Override
	public PhoneDto one(Long id) {
		// TODO Auto-generated method stub
		Phone entity = phoneRepo.findById(id).get();
		PhoneDto phone = new PhoneDto();
		phone.setAccountId(entity.getId());
		phone.setPhoneType(entity.getPhoneType());
		phone.setNumPhone(entity.getNumPhone());
		return phone;
	}

	@Override
	public void update(Long id, PhoneDto phone) {
		// TODO Auto-generated method stub
		Phone entity = phoneRepo.findById(id).get();
		populateEntity(phone, entity);
		phoneRepo.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		phoneRepo.deleteById(id);
	}

}
