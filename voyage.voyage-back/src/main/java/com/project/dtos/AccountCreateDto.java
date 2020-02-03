package com.project.dtos;

import org.hibernate.validator.constraints.Length;

import com.project.entities.Civility;
import com.project.validation.UniqueUsername;

import javax.validation.constraints.NotBlank;

public class AccountCreateDto {
	
	@NotBlank
	@Length( min = 2, max = 50)
	private String firstName;
	
	@NotBlank
	@Length( min = 2, max = 50)
	private String lastName;

    @NotBlank
    @Length(max = 256)
    @UniqueUsername(message = "{E_NOT_UNIQUE}")
    private String username;

    @NotBlank
    @Length(min = 8, max = 20)
    private String password;
    
	private Long civility;
	
	private Long role;


    protected AccountCreateDto() {
	// Empty no-arg constructor
    }
    
    
    @Override
	public String toString() {
		return "AccountCreateDto [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=[PROTECTED]}" + ", civility=" + civility + ", role=" + role + "]";
	}

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
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


	public Long getCivility() {
		return civility;
	}


	public void setCivility(Long civility) {
		this.civility = civility;
	}


	public Long getRole() {
		return role;
	}


	public void setRole(Long role) {
		this.role = role;
	}

	
	

//	public Civility getCivility() {
//		return civility;
//	}
//
//
//	public void setCivility(Civility civility) {
//		this.civility = civility;
//	}

}
