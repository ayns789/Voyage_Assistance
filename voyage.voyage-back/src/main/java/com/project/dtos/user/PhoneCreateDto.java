package com.project.dtos.user;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

import com.project.enums.PhoneType;

public class PhoneCreateDto {
	
	@Value("false")
	private boolean professional;
	
	@NotBlank
	private String numPhone;

	
	@Enumerated(EnumType.STRING)
	private PhoneType phoneType;
	
	@NotNull
    private Long accountId;
	
	
	public PhoneCreateDto() {
		
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


}
