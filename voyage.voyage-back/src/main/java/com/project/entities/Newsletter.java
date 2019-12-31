package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_newsletter")
public class Newsletter extends AbstractEntityId {
	
	
	private String nameSubscriber;

	
	private String emailSubscriber;
	
	public Newsletter() {
		
	}

	
	public String getNameSubscriber() {
		return nameSubscriber;
	}


	public void setNameSubscriber(String nameSubscriber) {
		this.nameSubscriber = nameSubscriber;
	}


	public String getEmailSubscriber() {
		return emailSubscriber;
	}

	public void setEmailSubscriber(String emailSubscriber) {
		this.emailSubscriber = emailSubscriber;
	}
	
	

}
