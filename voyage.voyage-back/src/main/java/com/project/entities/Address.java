package com.project.entities;



import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="t_address")
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
	
	@OneToOne
	@JoinColumn(name="establishment_id")
	private Establishment establishment;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="region_id")
	private Region region;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="country_id")
	private Country country;
	
	@OneToOne
	@JoinTable(
		       name = "t_account_address",
		       joinColumns = @JoinColumn(name = "address_id", referencedColumnName="id"),
		       inverseJoinColumns = @JoinColumn(name = "account_id", referencedColumnName="id")
		    )
	private Account account;
	
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


	public Establishment getEstablishment() {
		return establishment;
	}


	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
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


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	

	
}
