package com.project.dtos.user;


import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import com.project.entities.Civility;
import com.project.entities.Role;

public class AccountDto implements Serializable{
	
	
	@NotBlank
	@Length( min = 2, max = 50)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 50)
	private String lastName;
	
	@NotBlank
	@Length( min = 6, max = 40)
	private String login;
	
	@NotBlank
	@Length( min = 6, max = 15)
	private String password;


	
	private Role role;
	
	
	private Civility civility;
	
	public AccountDto() {
		
	}
	
	
	

@Override
	public String toString() {
		return "AccountDto [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login + ", password="
				+ password + ", role=" + role + ", civility=" + civility + "]";
	}

	
	

//public AccountDto(@NotBlank @Length(min = 2, max = 50) String firstName,
//			@NotBlank @Length(min = 2, max = 50) String lastName, @NotBlank @Length(min = 6, max = 40) String login,
//			@NotBlank @Length(min = 6, max = 15) String password, Long role, Long civility) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.login = login;
//		this.password = password;
//		this.role = role;
//		this.civility = civility;
//	}




	public AccountDto(@NotBlank @Length(min = 2, max = 50) String firstName,
			@NotBlank @Length(min = 2, max = 50) String lastName, @NotBlank @Length(min = 6, max = 40) String login,
			@NotBlank @Length(min = 6, max = 15) String password, Role role, Civility civility) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.role = role;
		this.civility = civility;
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




	public Civility getCivility() {
		return civility;
	}




	public void setCivility(Civility civility) {
		this.civility = civility;
	}




//	public Long getRole() {
//		return role;
//	}
//
//
//
//
//	public void setRole(Long role) {
//		this.role = role;
//	}
//
//
//
//
//	public Long getCivility() {
//		return civility;
//	}
//
//
//
//
//	public void setCivility(Long civility) {
//		this.civility = civility;
//	}




//	public Long getRoleId() {
//		return roleId;
//	}
//
//
//
//
//	public void setRoleId(Long roleId) {
//		this.roleId = roleId;
//	}
//
//
//
//
//	public Long getCivilityId() {
//		return civilityId;
//	}
//
//
//
//
//	public void setCivilityId(Long civilityId) {
//		this.civilityId = civilityId;
//	}
	


}
