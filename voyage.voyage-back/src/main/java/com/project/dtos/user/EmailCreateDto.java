package com.project.dtos.user;

import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;


public class EmailCreateDto {
	
	
    private Long accountId;
    
    private Long establishmentId;

	@Value("false")
	private boolean professional;
	
	@NotBlank
	private String email;

	
	public EmailCreateDto() {
		
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

	public Long getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(Long establishmentId) {
		this.establishmentId = establishmentId;
	}


}
