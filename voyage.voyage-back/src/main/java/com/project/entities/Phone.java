package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.project.enums.PhoneType;

@Entity
@Table(name="t_phone")
public class Phone extends AbstractEntityId {
	

	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false)
	private boolean professional;
	
	@NotBlank
	private String numPhone;

	
	@Enumerated(EnumType.STRING)
	private PhoneType phoneType;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="establishment_id")
	private Establishment establishment;
	
	public Phone() {
		
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


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Establishment getEstablishment() {
		return establishment;
	}


	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}
	
	

}
