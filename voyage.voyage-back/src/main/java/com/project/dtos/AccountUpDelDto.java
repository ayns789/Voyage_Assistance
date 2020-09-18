package com.project.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AccountUpDelDto {
	
//	@NotNull
//    private Long accountId;

	@NotBlank
	@Length( min = 2, max = 50)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 50)
	private String lastName;

	public AccountUpDelDto() {
		
	}
	
	
//	@Override
//	public String toString() {
//		return "AccountUpDel [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
//	}


//	public Long getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(Long accountId) {
//		this.accountId = accountId;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
}
