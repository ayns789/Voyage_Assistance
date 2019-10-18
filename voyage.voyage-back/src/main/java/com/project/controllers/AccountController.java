package com.project.controllers;


import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AccountViewDto;
import com.project.dtos.user.AddressCreateDto;
import com.project.services.AccountService;
import com.project.services.AddressService;



@RestController
@RequestMapping("/comptes")
public class AccountController {
	
	private final AccountService service;
	
	private final AddressService serviceAd;

    protected AccountController(AccountService service, AddressService serviceAd) {
	this.service = service;
	this.serviceAd = serviceAd;
    }
    
//    recuperer liste directement d'un dto
    @GetMapping
    protected List<AccountViewDto> getAll() {
    	List<AccountViewDto> accounts = service.getAll();
	return accounts;
    }
    
    @PostMapping(value="/adduser")
    public void createAccount(@RequestBody @Valid AccountCreateDto account) {
	service.create(account);
    }
    
    @PostMapping("/{id}/address")
    public void patchEndDate(@PathVariable("id") Long id,
	    @RequestBody @Valid AddressCreateDto address) {
	serviceAd.one(id);
    }

}
