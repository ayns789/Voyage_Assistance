package com.project.dtos.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;


public class EmailUserCreateDto {

	@Value("false")
	private boolean professional;
	
	@NotBlank
	private String email;
	
	@NotNull
    private Long accountId;

	
	public EmailUserCreateDto() {
		
	}

	public boolean isProfessional() {
		return professional;
	}

	public void setProfessional(boolean professional) {
		this.professional = professional;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	

}
