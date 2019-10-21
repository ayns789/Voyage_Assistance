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
import com.project.dtos.user.AddressDto;
import com.project.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	private final AddressService serviceAd;
	
	protected AddressController(AddressService serviceAd) {
	this.serviceAd = serviceAd;
	}
	
	@GetMapping("/{id}")
    public AddressDto one(@PathVariable("id") Long id) {
	return serviceAd.one(id);
    }
	
	@PostMapping("/add")
    public void createAddress(@RequestBody @Valid AddressDto address) {
	serviceAd.create(address);
    }
	
	@PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid AddressDto address) {
		serviceAd.update(id, address);
    }
	
	 @DeleteMapping("/{id}/del")
	    public void delete(@PathVariable("id") Long id) {
		 serviceAd.delete(id);
	    }
	
	
}
