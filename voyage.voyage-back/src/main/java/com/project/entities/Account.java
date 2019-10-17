package com.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="t_account")
public class Account extends AbstractEntityId {
	 
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String lastName;
	
	@NotBlank
	@Length( min = 6, max = 15)
	private String loginAccount;
	
	@NotBlank
	@Length( min = 6, max = 15)
	private String passwordAccount;
	

//	(name = "code_role", referencedColumnName = "code_role")
	@ManyToOne
	@JoinColumn(nullable=false)
	private Role role;
	
	@ManyToOne
	@JoinColumn(nullable=false, name="civility_id")
	private Civility civility;
	
	@OneToMany
	@JoinColumn(nullable=true, name="phone_id")
	private List<Phone> phones;
	
	@OneToOne
	@JoinColumn(name="email_id")
	private Email email;
	
	@OneToMany
	 @JoinTable(
	       name = "t_account_address",
	       joinColumns = @JoinColumn(name = "account_id"),
	       inverseJoinColumns = @JoinColumn(name = "address_id")
	    )
	 private List<Address> addresses;
	
	
	public Account() {
		
	}


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


	public String getLoginAccount() {
		return loginAccount;
	}


	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}


	public String getPasswordAccount() {
		return passwordAccount;
	}


	public void setPasswordAccount(String passwordAccount) {
		this.passwordAccount = passwordAccount;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}

	public Civility getCivility() {
		return civility;
	}

	public void setCivility(Civility civility) {
		this.civility = civility;
	}

//	public List<Contact> getContacts() {
//		return contacts;
//	}
//
//	public void setContacts(List<Contact> contacts) {
//		this.contacts = contacts;
//	}

//	public List<Booking> getBookings() {
//		return bookings;
//	}
//
//	public void setBookings(List<Booking> bookings) {
//		this.bookings = bookings;
//	}
	
	
	

}
