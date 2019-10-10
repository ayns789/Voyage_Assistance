package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="t_role")
public class Role extends AbstractEntityId {
	
	@Value("user")
	private String libRole;

	
	public Role() {
		
	}

	public String getLibRole() {
		return libRole;
	}

	public void setLibRole(String libRole) {
		this.libRole = libRole;
	}
	

}
