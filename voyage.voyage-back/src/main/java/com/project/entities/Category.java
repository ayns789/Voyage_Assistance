package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_category")
public class Category extends AbstractEntityId {
	
	@NotBlank
	private String theme;
	
	public Category() {
		
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	

}
