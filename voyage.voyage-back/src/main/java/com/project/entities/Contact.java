package com.project.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="t_contact")
public class Contact extends AbstractEntityId {
	
	
	@NotBlank
	private String message;
	
	@Column(nullable = false)
	private LocalDate dateRequest;
	
	@Column(nullable = false)
	private LocalDate dateTreatment;
	
	@OneToOne
	@JoinColumn(name="email_id")
	private Email email;
	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	public Contact() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDateRequest() {
		return dateRequest;
	}

	public void setDateRequest(LocalDate dateRequest) {
		this.dateRequest = dateRequest;
	}

	public LocalDate getDateTreatment() {
		return dateTreatment;
	}

	public void setDateTreatment(LocalDate dateTreatment) {
		this.dateTreatment = dateTreatment;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	
}
