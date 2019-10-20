package com.project.services;


import com.project.dtos.user.PhoneDto;

public interface PhoneService {
	
	void create(PhoneDto phone);
	
	PhoneDto one(Long id);
		
		void update(Long id, PhoneDto phone);
		
		void delete(Long id);

}
