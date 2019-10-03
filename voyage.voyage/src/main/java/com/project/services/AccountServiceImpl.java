package com.project.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AccountViewDto;
import com.project.entities.Account;
import com.project.repositories.AccountRepo;


@Service
public class AccountServiceImpl implements AccountService {
	
	private final AccountRepo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected AccountServiceImpl(AccountRepo repo) {
		this.repo = repo;
	    }
	
//	pour ecrire avec un dto, une entité au niveau des champs ( set une entité avec un get dto )
//	Entity a = mapper.map(dto, entity);
//	Account a = mapper.map(AccountCreateDto account, Account entity);
	
	
//	annotation Cacheable pour mettre en cache les données, pour tout ce qui est référentiel
//	"members" deviendra le nom de la "région" ( nom donné dans le cache )
//	@Cacheable("members")
//	pour se servir du dto direct pour un get ( voir AccountRepo et AccountViewDto )
	@Override
	public List<AccountViewDto> getAll() {
		return repo.getAllProjectBy();
	}
	
	@Override
	public AccountViewDto getOne(Long id) {
		return repo.getById(id);
		}

	private void populateEntity(AccountCreateDto account, Account entity) {
		mapper.map(account, entity);
//		entity.setFirstName(account.getFirstName());
//		entity.setLastName(account.getLastName());
//		entity.setLogin(account.getLogin());
//		entity.setPassword(account.getPassword());
//		entity.setCivility(account.getCivility());
	    }
	
	@Override
	public void create(AccountCreateDto account) {
		// TODO Auto-generated method stub
		Account entity = mapper.map(account, Account.class);
		repo.save(entity);
//		Account entity = new Account();
//		populateEntity(account, entity);
//		repo.save(entity); 
	}

	@Override
	public AccountCreateDto one(Long id) {
		// TODO Auto-generated method stub
		Account entity = repo.findById(id).get();
		AccountCreateDto account = new AccountCreateDto();
		account.setFirstName(entity.getFirstName());
		account.setLastName(entity.getLastName());
		account.setLogin(entity.getLogin());
		account.setPassword(entity.getPassword());
		account.setCivility(entity.getCivility());
		return account;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public void update(Long id, AccountCreateDto account) {
		// TODO Auto-generated method stub
		Account entity = repo.findById(id).get();
		populateEntity(account, entity);
		repo.save(entity);
	}
	
}
