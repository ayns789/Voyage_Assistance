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
import com.project.dtos.EstablishmentCreateDto;
import com.project.dtos.EstablishmentViewDto;
import com.project.dtos.LikeEstablishmentDto;
import com.project.entities.Account;
import com.project.services.EstablishmentService;

@RestController
@RequestMapping("/etablissement")
public class EstablishmentController {
	
	private final EstablishmentService service;
	
	protected EstablishmentController(EstablishmentService service) {
		this.service = service;
	    }

	@GetMapping("/all")
    protected List<EstablishmentViewDto> getAll() {
    	List<EstablishmentViewDto> accounts = service.getAll();
	return accounts;
    }
	
	@GetMapping("/{id}")
    public EstablishmentCreateDto one(@PathVariable("id") Long id) {
	return service.one(id);
    }
	
	@PostMapping("/add")
    public void create(@RequestBody @Valid EstablishmentCreateDto establishment) {
		service.create(establishment);
    }
	
	@PostMapping("/like")
    protected void like(@Valid @RequestBody LikeEstablishmentDto dto) {
		dto.setLikerId(null);
	service.like(dto);
    }

    
    @PostMapping("/unlike")
    protected void unlike(@Valid @RequestBody LikeEstablishmentDto dto) {
	dto.setLikerId(null);
	service.unlike(dto);
    }
	
	@PutMapping("/{id}")
    public void update(@PathVariable("id") Long id,
	    @RequestBody @Valid EstablishmentCreateDto establishment) {
		service.update(id, establishment);
    }
	
	 @DeleteMapping("/{id}/del")
	    public void delete(@PathVariable("id") Long id) {
		 service.delete(id);
	    }
	
}