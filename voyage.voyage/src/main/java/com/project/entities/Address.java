package com.project.entities;


import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="address")
public class Address extends AbstractEntityId {

	
	@NotBlank
	@Length( min = 1, max = 5)
	private String streetNumber;
	
	@NotBlank
	@Length( min = 3, max = 20)
	private String streetName;
	
	@NotBlank
	@Length( min = 3, max = 20)
	private String cityName;
	
	@NotBlank
	@Length( min = 2, max = 6)
	private String postalCode;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="establishment_id")
	private Establishment establishment;

	
	public Address () {
		
	}


	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public Account getAccount() {
		return account;
	}
	
	Locale locale;


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
