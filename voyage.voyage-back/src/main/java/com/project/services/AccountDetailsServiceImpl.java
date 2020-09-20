package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.project.config.CustomUserDetails;
import com.project.config.ResourceNotFoundException;
import com.project.dtos.AccountAuthViewDto;
import com.project.dtos.AccountCreateDto;
import com.project.dtos.AccountDataDto;
import com.project.dtos.AccountUpDelDto;
import com.project.dtos.AccountViewDto;
import com.project.entities.Account;
import com.project.entities.Civility;
import com.project.entities.Role;
import com.project.repositories.AccountJpaRepo;
import com.project.repositories.CivilityJpaRepo;
import com.project.repositories.EmailJpaRepo;
import com.project.repositories.EstablishmentJpaRepo;
import com.project.repositories.RoleJpaRepo;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	private final AccountJpaRepo repo;

	private final EstablishmentJpaRepo establishmentRepo;

	private final CivilityJpaRepo civilityRepo;

	private final RoleJpaRepo roleRepo;

	private final EmailJpaRepo emailRepo;

	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ModelMapper mapper;

	protected AccountDetailsServiceImpl(AccountJpaRepo repo, EstablishmentJpaRepo establishmentRepo,
			CivilityJpaRepo civilityRepo, RoleJpaRepo roleRepo, EmailJpaRepo emailRepo) {
		this.repo = repo;
		this.establishmentRepo = establishmentRepo;
		this.civilityRepo = civilityRepo;
		this.roleRepo = roleRepo;
		this.emailRepo = emailRepo;
	}

	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	// Throws UsernameNotFoundException (Spring contract)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountAuthViewDto user = repo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("no user found with username: " + username));
		return new CustomUserDetails(user);
	}

	// Throws ResourceNotFoundException (restful practice)
	@Override
	public AccountViewDto getCurrentUserInfo(Long id) {
		return repo.getById(id).orElseThrow(
				() -> new ResourceNotFoundException("with id:" + id));
	}

	@Override
	public void create(AccountCreateDto dto, PasswordEncoder passwordEncoder) {
		String encoded = passwordEncoder.encode(dto.getPassword());
//		Role role = roleRepo.findByDefaultRoleTrue();
		Role role = roleRepo.getOne(dto.getRole());
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		Civility civility = civilityRepo.getOne(dto.getCivility());
		Account account = new Account(dto.getFirstName(), dto.getLastName(), dto.getUsername() ,encoded, roles,
				true, true, true, true, civility, null, null, null);
		repo.save(account);
	}

	@Override
	public AccountCreateDto one(Long id) {
		Account entity = repo.findById(id).get();
		AccountCreateDto account = new AccountCreateDto();
		account.setFirstName(entity.getFirstName());
		account.setLastName(entity.getLastName());
		account.setUsername(entity.getUsername());
//		account.setPassword(entity.getPassword());
//		account.setCivility(entity.getCivility());
//		account.setRole(entity.getRole());
		return account;
	}
	
	@Override
	public boolean usernameIsUnique(String username) {
		return !repo.existsByUsernameIgnoreCase(username);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);

	}
	
//	@Override
//	public ResponseEntity<Account> updateAccount (long id, @Valid AccountUpDelDto dto) {
//		Account entity = repo.findById(id).get();
//		if (entity == null)
//			return ResponseEntity.notFound().build();
//
//		entity.setFirstName(dto.getFirstName());
//		entity.setLastName(dto.getLastName());
//		Account updatedUser = repo.save(entity);
//		return ResponseEntity.ok(updatedUser);
//	}
	
	
	@Override
    public void updateAccount(Long id, AccountUpDelDto dto) {
	Account entity =  repo.findById(id).get();
//	mapper.map(dto, entity); 
	entity.setFirstName(dto.getFirstName());
	entity.setLastName(dto.getLastName());
	repo.save(entity);
    }
	
	
//	@Override
//	public ResponseEntity<Account> updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public void update(Long id, AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		Account entity = repo.findById(id).get();
//		AccountUpDelDto account = new AccountUpDelDto();
//		account.setFirstName(entity.getFirstName());
//		account.setLastName(entity.getLastName());
//		repo.save(account);
//	}

	@Override
	public List<AccountViewDto> getAll() {
		return repo.getAllProjectBy();
	}

	

//	@Override
//	public void update(Long id, AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public ResponseEntity<AccountUpDelDto> updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public ResponseEntity<AccountUpDelDto> updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public void updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void update(Long id, AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void updateAccount(Long id, @Valid AccountUpDelDto account) {
//		// TODO Auto-generated method stub
//		
//	}
}

