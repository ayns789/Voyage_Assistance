package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="role")
public class Role extends AbstractEntityId {
	
	@Value("user")
	private String libRole;
	
//	@OneToOne
//	@JoinColumn(name = "id_account", referencedColumnName = "id_account")
//	private Account account;
	
	public Role() {
		
	}

	public String getLibRole() {
		return libRole;
	}

	public void setLibRole(String libRole) {
		this.libRole = libRole;
	}
	

}
