package com.project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.EstablishmentViewDto;
import com.project.services.EstablishmentService;

@RestController
@RequestMapping("/etablissements")
public class EstablishmentController {
	
	private final EstablishmentService service;
	
	protected EstablishmentController(EstablishmentService service) {
		this.service = service;
	    }

	@GetMapping
    protected List<EstablishmentViewDto> getAll() {
    	List<EstablishmentViewDto> accounts = service.getAll();
	return accounts;
    }
	
}
