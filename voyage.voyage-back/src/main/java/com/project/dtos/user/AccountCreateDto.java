package com.project.dtos.user;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import com.project.entities.Civility;
import com.project.entities.Role;

public class AccountCreateDto {
	
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
	
	public AccountCreateDto() {
		
	}
	
	

	public AccountCreateDto(@NotBlank @Length(min = 2, max = 30) String firstName,
		@NotBlank @Length(min = 2, max = 30) String lastName, @Length(min = 6, max = 15) String login,
		@Length(min = 6, max = 15) String password, Role role, Civility civility) {
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

}
