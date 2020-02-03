package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_region")
public class Region extends AbstractEntityId {
	
	@Column(name="reg_code")
	private String codeRegion;
	
	@NotBlank
	@Column(name="reg_libelle")
	private String libRegion;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;
	
	public Region() {
		
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getLibRegion() {
		return libRegion;
	}

	public void setLibRegion(String libRegion) {
		this.libRegion = libRegion;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	

}

