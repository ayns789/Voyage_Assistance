package com.project.controllers;


import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountViewDto;
import com.project.dtos.user.AddressDto;
import com.project.services.AccountService;
import com.project.services.AddressService;


@RestController
@RequestMapping("/account")
public class AccountController {
	
	private final AccountService service;
	
	private final AddressService serviceAd;

    protected AccountController(AccountService service, AddressService serviceAd) {
	this.service = service;
	this.serviceAd = serviceAd;
    }
    
    @GetMapping("/{id}")
    public AccountDto one(@PathVariable("id") Long id) {
	return service.one(id);
    }
    
//    recuperer liste directement d'un dto
    @GetMapping("/all")
    protected List<AccountViewDto> getAll() {
    	List<AccountViewDto> accounts = service.getAll();
	return accounts; 
    }
    
    @PostMapping(value="/add")
    public void createAccount(@RequestBody @Valid AccountDto account) {
	service.create(account);
    }
    
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid AccountDto account) {
	service.update(id, account);
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @PostMapping("/address")
    public void createAddress(@RequestBody @Valid AddressDto address) {
	serviceAd.create(address);
    }
    

}
