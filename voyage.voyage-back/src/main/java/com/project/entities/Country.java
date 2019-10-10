package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_country")
public class Country extends AbstractEntityId {
	
	
	private Integer codeCountry;
	
	private String libCountry;
	
	
	
	public Country() {
		
	}



	public Integer getCodeCountry() {
		return codeCountry;
	}



	public void setCodeCountry(Integer codeCountry) {
		this.codeCountry = codeCountry;
	}



	public String getLibCountry() {
		return libCountry;
	}



	public void setLibCountry(String libCountry) {
		this.libCountry = libCountry;
	}


}
