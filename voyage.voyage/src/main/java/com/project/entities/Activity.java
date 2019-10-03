package com.project.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="activity")
public class Activity extends AbstractEntityId {
	

	
	@NotBlank
	@Length( min = 3, max = 40)
	private String nameActivity;
	
	
	@OneToMany
	@JoinColumn
	private List<Media> medias;
	
	@OneToMany
	@JoinColumn
	private List<SpecialAttention> specialAttentions;
	
	
	public Activity() {
		
	}


	public String getNameActivity() {
		return nameActivity;
	}

	public void setNameActivity(String nameActivity) {
		this.nameActivity = nameActivity;
	}


	public List<Media> getMedias() {
		return medias;
	}


	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}


	public List<SpecialAttention> getSpecialAttentions() {
		return specialAttentions;
	}


	public void setSpecialAttentions(List<SpecialAttention> specialAttentions) {
		this.specialAttentions = specialAttentions;
	}


}
