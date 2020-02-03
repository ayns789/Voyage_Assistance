package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.user.EmailDto;
import com.project.dtos.user.LikeEstablishmentDto;
import com.project.entities.Account;
import com.project.entities.Email;
import com.project.repositories.AccountRepo;
import com.project.repositories.EmailRepo;

@Service
public class EmailServiceImpl implements EmailService{
	
	private final EmailRepo emailRepo;
	
	private final AccountRepo accountRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected EmailServiceImpl(EmailRepo emailRepo, AccountRepo accountRepo) {
		this.emailRepo = emailRepo;
		this.accountRepo = accountRepo;
	}
	
	private void populateEntity(EmailDto email, Email entity) {
		mapper.map(email, entity);
	    }

	@Override
	public void create(EmailDto email) {
		// TODO Auto-generated method stub
		Account account = accountRepo.getOne(email.getAccountId());
//		Address entity = mapper.map(address, Address.class);
		Email entity = new Email();
		entity.setAccount(account);
		entity.setEmail(email.getEmail());
//		entity.setProfessional(email.get);
		emailRepo.save(entity);
	}

	@Override
	public EmailDto one(Long id) {
		Email entity = emailRepo.findById(id).get();
		EmailDto email = new EmailDto();
		email.setAccountId(entity.getId());
		email.setEmail(entity.getEmail());
//		email.setProfessional(entity.get
		return email;
	}

	@Override
	public void update(Long id, EmailDto email) {
		// TODO Auto-generated method stub
		Email entity = emailRepo.findById(id).get();
		populateEntity(email, entity);
		emailRepo.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		emailRepo.deleteById(id);
	}

	
	

}
