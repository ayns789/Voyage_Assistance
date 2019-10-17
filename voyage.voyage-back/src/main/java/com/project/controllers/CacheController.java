package com.project.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.services.CacheService;

@RequestMapping("/admin")
@RestController
public class CacheController {
	
	private final CacheService service;
	
	protected CacheController(CacheService service) {
		this.service = service;
	}
	
	@DeleteMapping("/caches/{region}")
	protected void clearCacheRegion(@PathVariable("region") String region) {
		service.clearCacheRegion(region);
	}
	
	@DeleteMapping("/caches")
	protected void clearCacheRegions() {
		service.clearCacheRegions();
	}
	
	
	

}
