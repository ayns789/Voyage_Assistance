package com.project.services;

import java.util.List;

import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountListDto;
import com.project.dtos.user.AccountViewDto;



public interface AccountService {
	
	void create(AccountDto account);

	AccountViewDto getOne(Long id);

	AccountDto one(Long id);
	
    void delete(Long id);

    void update(Long id, AccountDto account);

	List<AccountViewDto> getAll();

	AccountListDto list(Integer page, Integer size);
	
}
