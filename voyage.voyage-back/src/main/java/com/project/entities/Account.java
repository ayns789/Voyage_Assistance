package com.project.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_account")
public class Account extends AbstractEntityId {
	 
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String loginAccount;
	
	
	private String passwordAccount;
	

//	(name = "code_role", referencedColumnName = "code_role")
	
	@OneToOne
	@JoinColumn(nullable=false, name="role_id")
	private Role role;
	
	@OneToOne
	@JoinColumn(nullable=false, name="civility_id")
	private Civility civility;
	
	@OneToOne(mappedBy="account")
	private Email email;
	
	@OneToMany(mappedBy="account")
	private List<Phone> phones;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
		       name = "t_account_address",
		       joinColumns = @JoinColumn(name = "account_id", referencedColumnName="id"),
		       inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName="id")
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


	public Civility getCivility() {
		return civility;
	}

	public void setCivility(Civility civility) {
		this.civility = civility;
	}


	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}


	public List<Phone> getPhones() {
		return phones;
	}


	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
		

}
