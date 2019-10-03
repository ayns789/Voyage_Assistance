package com.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="account")
public class Account extends AbstractEntityId {
	
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 30)
	private String lastName;
	
	@NotBlank
	@Length( min = 6, max = 15)
	private String login;
	
	@NotBlank
	@Length( min = 6, max = 15)
	private String password;
	

//	(name = "code_role", referencedColumnName = "code_role")
	@ManyToOne
	@JoinColumn
	private Role role;
	
	@OneToOne
	@JoinColumn(nullable=false)
	private Civility civility;
	
	@OneToMany
	@JoinColumn
	private List<Address> addresses;
	
	@OneToOne
	@JoinColumn
	private Email email;
	
//	@OneToMany
//	@JoinColumn(name = "account_id")
//	private List<Phone> phones;
	

	
//	// "mappedBy" indique à hibernate la classe qui est parent, dans une relation bidirectionnelle
//	@OneToMany(
//	        mappedBy = "account",
//	        cascade = CascadeType.ALL,
//	        orphanRemoval = true
//	    )
//	private List<Contact> contacts;
	

//	@OneToMany(
//	        mappedBy = "account",
//	        cascade = CascadeType.ALL,
//	        orphanRemoval = true
//	    )
//	private List<Booking> bookings;
	
	
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

//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}

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
