package com.project.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_activity")
public class Activity extends AbstractEntityId {
	

	@Column(name="act_title")
	private String title;
	
	@Column(name="act_reference")
	private String reference;
	
	
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

	public List<Establishment> getEstablishment() {
		return establishment;
	}


	public void setEstablishment(List<Establishment> establishment) {
		this.establishment = establishment;
	}



	public List<Media> getMedias() {
		return medias;
	}


	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}


}