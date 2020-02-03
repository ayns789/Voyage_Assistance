package com.project.dtos;

import javax.validation.constraints.NotBlank;

public class NewsletterDto {

	@NotBlank
	private String nameSubscriber;

	@NotBlank
	private String emailSubscriber;
	
	public NewsletterDto() {
		
	}

	public NewsletterDto(@NotBlank String nameSubscriber, @NotBlank String emailSubscriber) {
		super();
		this.nameSubscriber = nameSubscriber;
		this.emailSubscriber = emailSubscriber;
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
