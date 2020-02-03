package com.project.dtos;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import com.project.entities.Country;
import com.project.entities.Region;

public class AddressDto {
	
	
    private Long accountId;
    
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
	
	private Region region;
	
	private Country country;
	
	public AddressDto() {
		
	}


	public Long getAccountId() {
		return accountId;
	}


	public void setAccountId(Long accountId) {
		this.accountId = accountId;
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}

