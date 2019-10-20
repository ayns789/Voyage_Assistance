package com.project.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping
    public void createAddress(@RequestBody @Valid AddressDto address) {
	serviceAd.create(address);
    }
}
