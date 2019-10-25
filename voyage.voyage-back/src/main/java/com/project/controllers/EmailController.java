package com.project.controllers;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.EmailDto;
import com.project.services.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	private EmailService service;
	
	protected EmailController(EmailService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
    public EmailDto one(@PathVariable("id") Long id) {
	return service.one(id);
    }
	
	@PostMapping("/add")
    public void create(@RequestBody @Valid EmailDto email) {
		service.create(email);
    }
	
	@PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid EmailDto email) {
		service.update(id, email);
    }
	
	 @DeleteMapping("/{id}/del")
	    public void delete(@PathVariable("id") Long id) {
		 service.delete(id);
	    }
	
	
}
