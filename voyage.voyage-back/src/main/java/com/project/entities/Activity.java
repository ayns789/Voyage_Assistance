package com.project.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="t_activity")
public class Activity extends AbstractEntityId {
	

	@NotBlank
	@Length( min = 3, max = 40)
	private String categoryActivity;
	
	@OneToMany(mappedBy="activity")
	private List<SpecialAttention> specialAttenions;
	
	@OneToMany(mappedBy="activity")
	private List<Media> medias;
	
	@OneToMany
	@JoinTable(
		       name = "t_establishment_activity",
		       joinColumns = @JoinColumn(name = "activity_id", referencedColumnName="id"),
		       inverseJoinColumns = @JoinColumn(name = "establishment_id", referencedColumnName="id")
		    )
	private List<Establishment> establishment;
	
	
	public Activity() {
		
	}


	public String getCategoryActivity() {
		return categoryActivity;
	}


	public void setCategoryActivity(String categoryActivity) {
		this.categoryActivity = categoryActivity;
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
