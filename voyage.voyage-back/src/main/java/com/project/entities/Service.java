package com.project.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="t_service")
public class Service extends AbstractEntityId {
	
	@Column(length=50)
	private String categoryService;
	
	@OneToMany(mappedBy="service")
	private List<SpecialAttention> specialAttenions;
	
	@OneToMany(mappedBy="service")
	private List<Media> medias;
	
	
	@OneToMany
	@JoinTable(
		       name = "t_establishment_service",
		       joinColumns = @JoinColumn(name = "service_id", referencedColumnName="id"),
		       inverseJoinColumns = @JoinColumn(name = "establishment_id", referencedColumnName="id")
		    )
	private List<Establishment> establishment;
	
	
	public Service() {
		
	}

	public String getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(String categoryService) {
		this.categoryService = categoryService;
	}


	public List<Establishment> getEstablishment() {
		return establishment;
	}


	public void setEstablishment(List<Establishment> establishment) {
		this.establishment = establishment;
	}

	public List<SpecialAttention> getSpecialAttenions() {
		return specialAttenions;
	}

	public void setSpecialAttenions(List<SpecialAttention> specialAttenions) {
		this.specialAttenions = specialAttenions;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}
	

}
