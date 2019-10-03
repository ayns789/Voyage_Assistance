package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="civility")
public class Civility extends AbstractEntityId {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="code_civility")
//	private Integer codeCivility;
	
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
