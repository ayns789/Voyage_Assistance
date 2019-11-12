package com.project.controllers;


import java.util.List;
import javax.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountListDto;
import com.project.dtos.user.AccountViewDto;
import com.project.services.AccountService;



@RestController
@RequestMapping("/account")
public class AccountController {
	
	private final AccountService service;
	

    protected AccountController(AccountService service) {
	this.service = service;
    }
    
    @GetMapping("/get/{id}")
    public AccountDto one(@PathVariable("id") Long id) {
	return service.one(id);
    }
    
////    recuperer liste directement d'un ViewDto
    @GetMapping("/all")
    protected List<AccountViewDto> getAll() {
    	List<AccountViewDto> accounts = service.getAll();
	return accounts; 
    }
    
//    // recupere liste avec parametres de pagination
//    @GetMapping(value="/addall", params = { "page" , "size"})
//    public Page list(@RequestParam("page") Integer page , @RequestParam("size") Integer size) {
////	return service.list(page, size);
//    	Page results = (Page) service.list(page, size);
//    	return results;
//    }
    
    // recupere liste avec parametres de pagination
    @GetMapping(value="/addall")
    public AccountListDto list(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
	return service.list(page, size);
    }
    
    @PostMapping(value="/add")
    public void createAccount(@RequestBody @Valid AccountDto account) {
	service.create(account);
    }
    
    @PutMapping("/{id}/modif")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid AccountDto account) {
	service.update(id, account);
    }

    
    @DeleteMapping("/{id}/del")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }
    
}
