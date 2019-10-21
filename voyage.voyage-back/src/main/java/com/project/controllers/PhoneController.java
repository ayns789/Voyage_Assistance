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
import com.project.dtos.user.PhoneDto;
import com.project.services.PhoneService;


@RestController
@RequestMapping("/phone")
public class PhoneController {
	
	private final PhoneService service;
	
	protected PhoneController(PhoneService service) {
		this.service = service;
	}

	
	@GetMapping("/{id}")
    public PhoneDto one(@PathVariable("id") Long id) {
	return service.one(id);
    }
	
	@PostMapping("/add")
    public void create(@RequestBody @Valid PhoneDto phone) {
		service.create(phone);
    }
	
	@PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid PhoneDto phone) {
		service.update(id, phone);
    }
	
	 @DeleteMapping("/{id}/del")
	    public void delete(@PathVariable("id") Long id) {
		 service.delete(id);
	    }
	 
}
