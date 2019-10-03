package com.project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.AccountViewDto;
import com.project.services.AccountService;


@RestController
@RequestMapping("/comptes")
public class AccountController {
	
	private final AccountService service;

    protected AccountController(AccountService service) {
	this.service = service;
    }
    
//    recuperer liste directement d'un dto
    @GetMapping
    protected List<AccountViewDto> getAll() {
    	List<AccountViewDto> accounts = service.getAll();
	return accounts;
    }

}
