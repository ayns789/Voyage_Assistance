package com.project.services;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountListDto;
import com.project.dtos.user.AccountViewDto;
import com.project.dtos.user.AddressDto;
import com.project.dtos.user.EmailDto;
import com.project.dtos.user.LikeEstablishmentDto;
import com.project.entities.Account;
import com.project.entities.Address;
import com.project.entities.Civility;
import com.project.entities.Email;
import com.project.entities.Establishment;
import com.project.entities.Role;
import com.project.repositories.AccountRepo;
import com.project.repositories.CivilityRepo;
import com.project.repositories.EstablishmentRepo;
import com.project.repositories.RoleRepo;



@Service
public class AccountServiceImpl implements AccountService {
	
	private final AccountRepo repo;
	
	private final EstablishmentRepo establishmentRepo;
	
	private final CivilityRepo civilityRepo;
	
	private final RoleRepo roleRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected AccountServiceImpl(AccountRepo repo, EstablishmentRepo establishmentRepo, CivilityRepo civilityRepo, RoleRepo roleRepo) {
		this.repo = repo;
		this.establishmentRepo = establishmentRepo;
		this.civilityRepo = civilityRepo;
		this.roleRepo = roleRepo;
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

	private void populateEntity(AccountDto account, Account entity) {
		mapper.map(account, entity);
//		entity.setFirstName(account.getFirstName());
//		entity.setLastName(account.getLastName());
//		entity.setLogin(account.getLogin());
//		entity.setPassword(account.getPassword());
//		entity.setCivility(account.getCivility());
//		entity.setRole(account.getRole());
	    }
	
	@Override
	public void create(AccountDto account) {
//		Civility civility = civilityRepo.getOne(account.getCivility());
//		Role role = roleRepo.getOne(account.getRole());
		
		Account entity = mapper.map(account, Account.class);
//		Account entity = new Account();
//		
//		entity.setRole(role);
//		entity.setCivility(civility);
//		entity.setLastName(account.getLastName());
//		entity.setFirstName(account.getFirstName());
//		entity.setLogin(account.getLogin());
//		entity.setPassword(account.getPassword());
		
		repo.save(entity);
//		Account entity = new Account();
//		populateEntity(account, entity);
//		repo.save(entity); 
	}
	
//	@Override
//	public void create(EmailDto email) {
//		Account account = accountRepo.getOne(email.getAccountId());
//		Email entity = new Email();
//		entity.setAccount(account);
//		entity.setEmail(email.getEmail());
//		emailRepo.save(entity);
//	}

	@Override
	public AccountDto one(Long id) {
		Account entity = repo.findById(id).get();
		AccountDto account = new AccountDto();
		account.setFirstName(entity.getFirstName());
		account.setLastName(entity.getLastName());
		account.setLogin(entity.getLogin());
		account.setPassword(entity.getPassword());
//		account.setCivility(entity.getId());
//		account.setRole(entity.getId());
		account.setCivility(entity.getCivility());
		account.setRole(entity.getRole());
		return account;
	}
	
	@Override
	@Transactional
    public AccountListDto list (Integer pageNumber, Integer size) {
		AccountListDto result = new AccountListDto();
		Pageable pageable = PageRequest.of(pageNumber, size, Sort.by("lastName"));
		Page<AccountDto> page = repo.list(pageable);
		result.setAccounts(page.getContent());
		return result;
    }

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public void update(Long id, AccountDto account) {
		Account entity = repo.findById(id).get();
		populateEntity(account, entity);
		repo.save(entity);
	}

//	@Override
//	public AccountDto one(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	


//	@Override
//	public AccountListDto list(Integer page, Integer size) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
