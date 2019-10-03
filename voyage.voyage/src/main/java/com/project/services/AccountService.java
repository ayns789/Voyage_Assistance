package com.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.dtos.user.AccountCreateDto;
import com.project.dtos.user.AccountViewDto;


@Service
public interface AccountService {
	
	void create(AccountCreateDto diploma);

	AccountViewDto getOne(Long id);

	AccountCreateDto one(Long id);
	
    void delete(Long id);

    void update(Long id, AccountCreateDto diploma);

	List<AccountViewDto> getAll();

    

}
