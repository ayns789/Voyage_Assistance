package com.project.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_category")
public class Category extends AbstractEntityId {
	
	@NotBlank
	private String theme;
	
	@OneToMany(mappedBy="category")
	private List<Establishment> establishments;
	
	public Category() {
		
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<Establishment> getEstablishments() {
		return establishments;
	}

	public void setEstablishments(List<Establishment> establishments) {
		this.establishments = establishments;
	}
	

}
