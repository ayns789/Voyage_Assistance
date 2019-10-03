package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="region")
public class Region extends AbstractEntityId {
	
	
	private Integer codeRegion;
	
	@NotBlank
	private String libRegion;
	
	public Region() {
		
	}

	public Integer getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(Integer codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getLibRegion() {
		return libRegion;
	}

	public void setLibRegion(String libRegion) {
		this.libRegion = libRegion;
	}

}
