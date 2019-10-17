package com.project.dtos.user;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.project.entities.Address;
import com.project.entities.Booking;
import com.project.entities.Civility;
import com.project.entities.Contact;
import com.project.entities.Role;

public class AccountCreateDto {
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String lastName;
	
//	@NotBlank
	@Length( min = 6, max = 15)
	private String login;
	
//	@NotBlank
	@Length( min = 6, max = 15)
	private String password;
	

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "code_role", referencedColumnName = "code_role")
	private Role role;
	
//	@OneToOne
	private Civility civility;
	
	private List<Address> addresses;
	
//	@OneToMany(
//	        mappedBy = "account",
//	        cascade = CascadeType.ALL,
//	        orphanRemoval = true
//	    )
	private List<Contact> contacts;
	

//	@OneToMany(
//	        mappedBy = "account",
//	        cascade = CascadeType.ALL,
//	        orphanRemoval = true
//	    )
	private List<Booking> bookings;
	
	
	public AccountCreateDto() {
		
	}
	
	

	public AccountCreateDto(@NotBlank @Length(min = 2, max = 30) String firstName,
		@NotBlank @Length(min = 2, max = 30) String lastName, @Length(min = 6, max = 15) String login,
		@Length(min = 6, max = 15) String password, Role role, Civility civility, List<Address> addresses) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.login = login;
	this.password = password;
	this.role = role;
	this.civility = civility;
	this.addresses = addresses;
}



//	public AccountCreateDto(String firstName,
//			String lastName, String login,
//			String password, Role role, Civility civility, ) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.login = login;
//		this.password = password;
//		this.civility = civility;
////		this.contacts = contacts;
////		this.bookings = bookings;
//		this.role = role;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Civility getCivility() {
		return civility;
	}

	public void setCivility(Civility civility) {
		this.civility = civility;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}



	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


}
