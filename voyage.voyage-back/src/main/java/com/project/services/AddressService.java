package com.project.services;

import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AddressDto;

public interface AddressService {
	
	void create(AddressDto address);
	
	AddressDto one(Long id);
	
	void update(Long id, AddressDto address);
	
	void delete(Long id);

}
