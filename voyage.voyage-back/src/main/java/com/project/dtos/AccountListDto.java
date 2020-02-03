package com.project.dtos;

import java.util.List;

import com.project.dtos.AccountCreateDto;

public class AccountListDto {
	
	private List<AccountCreateDto> accounts;
	
	public AccountListDto() {
		
	}

	public List<AccountCreateDto> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountCreateDto> accounts) {
		this.accounts = accounts;
	}

}

