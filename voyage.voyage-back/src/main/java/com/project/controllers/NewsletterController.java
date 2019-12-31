package com.project.controllers;

import javax.validation.Valid;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.dtos.user.NewsletterDto;
import com.project.services.NewsletterService;

// @CrossOrigin(origins = "http://localhost:1234")
@RestController
@RequestMapping("/newsletter")
public class NewsletterController {
	
	private final NewsletterService service;
	
	protected NewsletterController(NewsletterService service) {
		this.service = service;
	}
	
	@CrossOrigin
	@PostMapping(value="/add")
//	@RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createAccount(@RequestBody @Valid NewsletterDto newsletter) {
    	service.create(newsletter);
    }
	

}
