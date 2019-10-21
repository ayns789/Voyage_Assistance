package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_subject")
public class Subject extends AbstractEntityId {
	

	@NotBlank
	private String libSubject;
	
	@OneToOne(mappedBy="subject")
	private Contact contact;
	
	public Subject() {
		
	}

	public String getLibSubject() {
		return libSubject;
	}

	public void setLibSubject(String libSubject) {
		this.libSubject = libSubject;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
