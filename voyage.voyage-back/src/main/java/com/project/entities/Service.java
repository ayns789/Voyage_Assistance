package com.project.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="t_service")
public class Service extends AbstractEntityId {
	
	@Column(length=50)
	private String medicalCare;
	
	@Column(length=50)
	private String occupationalTherapist;
	
	@Column(length=50)
	private String dietetic;
	
	
	@OneToMany
	@JoinColumn(name="media_id")
	private List<Media> medias;
	
	@OneToMany
	@JoinColumn(name="special_attention_id")
	private List<SpecialAttention> specialAttentions;
	
	
	public Service() {
		
	}


	public String getMedicalCare() {
		return medicalCare;
	}

	public void setMedicalCare(String medicalCare) {
		this.medicalCare = medicalCare;
	}

	public String getOccupationalTherapist() {
		return occupationalTherapist;
	}

	public void setOccupationalTherapist(String occupationalTherapist) {
		this.occupationalTherapist = occupationalTherapist;
	}

	public String getDietetic() {
		return dietetic;
	}

	public void setDietetic(String dietetic) {
		this.dietetic = dietetic;
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
