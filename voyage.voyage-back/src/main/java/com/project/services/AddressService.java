package com.project.services;

import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AddressCreateDto;

public interface AddressService {
	
	void create(AddressCreateDto address);
	
	AddressCreateDto one(Long id);
	
	void updateAddress(Long id, AddressCreateDto address);

}
