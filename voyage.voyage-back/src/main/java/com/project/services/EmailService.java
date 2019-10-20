package com.project.services;


import com.project.dtos.user.EmailDto;

public interface EmailService {
	
	void create(EmailDto email);
	
	EmailDto one(Long id);
		
		void update(Long id, EmailDto email);
		
		void delete(Long id);

}
