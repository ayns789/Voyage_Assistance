package com.project.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_category")
public class Category extends AbstractEntityId {
	
	@NotBlank
	@Column(name="cat_theme")
	private String theme;
	
	@ManyToMany
	@JoinTable(
	       name = "t_establishment_category",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "category_id")
	    )
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
