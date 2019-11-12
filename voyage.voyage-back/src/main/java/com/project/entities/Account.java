package com.project.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_account")
public class Account extends AbstractEntityId {
	 
	
	private String firstName;
	
	
	private String lastName;
	
	@Column(name="login_account")
	private String login;
	
	@Column(name="password_account")
	private String password;
	

//	(name = "code_role", referencedColumnName = "code_role")
	
	@ManyToOne
	@JoinColumn(nullable=false, name="role_id")
	private Role role;
	
	@ManyToOne
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
