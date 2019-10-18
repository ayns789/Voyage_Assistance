package com.project.services;

import java.util.List;
import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AccountViewDto;



public interface AccountService {
	
	void create(AccountCreateDto account);

	AccountViewDto getOne(Long id);

	AccountCreateDto one(Long id);
	
    void delete(Long id);

    void update(Long id, AccountCreateDto account);

	List<AccountViewDto> getAll();
	
}
