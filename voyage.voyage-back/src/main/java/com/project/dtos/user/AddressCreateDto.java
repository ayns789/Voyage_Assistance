package com.project.dtos.user;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import com.project.entities.Account;
import com.project.entities.Country;
import com.project.entities.Region;

public class AddressCreateDto {
	
	
    private Long accountId;
    
//    private Long establishmentId;
	
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
	
	public AddressCreateDto() {
		
	}


	public AddressCreateDto(Account account,
			@NotBlank @Length(min = 1, max = 5) String streetNumber,
			@NotBlank @Length(min = 3, max = 20) String streetName,
			@NotBlank @Length(min = 3, max = 20) String cityName, @NotBlank @Length(min = 2, max = 6) String postalCode,
			Region region, Country country) {
		super();
		this.accountId = accountId;
//		this.establishmentId = establishmentId;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.cityName = cityName;
		this.postalCode = postalCode;
		this.region = region;
		this.country = country;
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

//	public Long getEstablishmentId() {
//		return establishmentId;
//	}
//
//	public void setEstablishmentId(Long establishmentId) {
//		this.establishmentId = establishmentId;
//	}

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
