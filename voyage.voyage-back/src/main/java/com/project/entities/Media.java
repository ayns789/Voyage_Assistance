package com.project.entities;

import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_media")
public class Media extends AbstractEntityId {
	
	private Blob pictureContent;
	
	@ManyToOne
	@JoinColumn(name="establishment_id")
	private Establishment establishment;
	
	@ManyToOne
	@JoinColumn(name="activity_id")
	private Activity activity;
	
	@ManyToOne
	@JoinColumn(name="service_id")
	private Service service;


	public Media() {
		
	}


	public Blob getPictureContent() {
		return pictureContent;
	}

	public void setPictureContent(Blob pictureContent) {
		this.pictureContent = pictureContent;
	}


	public Establishment getEstablishment() {
		return establishment;
	}


	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

}
