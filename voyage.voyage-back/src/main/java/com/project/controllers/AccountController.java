package com.project.controllers;

import java.util.List;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.project.dtos.AccountAuthViewDto;
import com.project.dtos.AccountUpDelDto;
import com.project.dtos.AccountCreateDto;
import com.project.dtos.AccountViewDto;
import com.project.entities.Account;
import com.project.services.AccountDetailsService;

@RestController
@RequestMapping("/account")
public class AccountController {

	private final AccountDetailsService service;

	private final PasswordEncoder passwordEncoder; 

	protected AccountController(AccountDetailsService service, PasswordEncoder passwordEncoder) {
		this.service = service;
		this.passwordEncoder = passwordEncoder;
	}

	/**
	 * Creates a new user with given username and password, and default role.
	 *
	 * @param inputs the inputs
	 */
	@CrossOrigin
	@PostMapping("/add")
	protected void create(@RequestBody @Valid AccountCreateDto inputs) {
		service.create(inputs, passwordEncoder);
	}

	@CrossOrigin
//	@PreAuthorize("hasRole('USER')")
	@GetMapping("/get/{id}")
	public AccountCreateDto one(@PathVariable("id") Long id) {
//		return service.getCurrentUserInfo(id);
		return service.one(id);
	}

////recuperer liste directement d'un ViewDto
	@CrossOrigin
	@GetMapping("/all")
	protected List<AccountViewDto> getAll() {
		List<AccountViewDto> accounts = service.getAll();
		return accounts;

	}

//	@CrossOrigin
//	@PutMapping("/modif/{id}")
//	ResponseEntity<Account> update(@PathVariable("id") Long id, @RequestBody @Valid AccountUpDelDto dto) {
//		return service.updateAccount(id, dto);
////		return null;
//	}
	
	@CrossOrigin
	@PutMapping("/modif/{id}")
    public void update(@PathVariable("id") Long id,
    		@RequestBody @Valid AccountUpDelDto dto) {
	service.updateAccount(id, dto);
    }

	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}