package com.project.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_civility")
public class Civility extends AbstractEntityId {
	

	
	@NotBlank
	private String libCivility;
	
	public Civility() {
		
	}

	public String getLibCivility() {
		return libCivility;
	}

	public void setLibCivility(String libCivility) {
		this.libCivility = libCivility;
	}

	
}
