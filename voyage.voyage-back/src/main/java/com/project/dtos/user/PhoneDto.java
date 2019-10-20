package com.project.dtos.user;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.project.enums.PhoneType;

public class PhoneDto {
	
	@NotNull
    private Long accountId;
	
	private boolean professional;
	
	@NotBlank
	private String numPhone;

	
	@Enumerated(EnumType.STRING)
	private PhoneType phoneType;
		
	public PhoneDto() {
		
	}

	public boolean isProfessional() {
		return professional;
	}


	public void setProfessional(boolean professional) {
		this.professional = professional;
	}


	public String getNumPhone() {
		return numPhone;
	}


	public void setNumPhone(String numPhone) {
		this.numPhone = numPhone;
	}


	public PhoneType getPhoneType() {
		return phoneType;
	}


	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	

}
