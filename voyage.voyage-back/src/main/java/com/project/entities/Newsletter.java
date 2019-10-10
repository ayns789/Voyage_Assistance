package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_newsletter")
public class Newsletter extends AbstractEntityId {
	

	@NotBlank
	private String emailSubscriber;
	
	public Newsletter() {
		
	}

	public String getEmailSubscriber() {
		return emailSubscriber;
	}

	public void setEmailSubscriber(String emailSubscriber) {
		this.emailSubscriber = emailSubscriber;
	}
	
	

}
