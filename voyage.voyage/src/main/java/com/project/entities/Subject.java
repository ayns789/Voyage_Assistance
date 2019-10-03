package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="subject")
public class Subject extends AbstractEntityId {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="code_subject")
//	private Integer codeSubject;
	
	@NotBlank
	private String libSubject;
	
	public Subject() {
		
	}

	public String getLibSubject() {
		return libSubject;
	}

	public void setLibSubject(String libSubject) {
		this.libSubject = libSubject;
	}
	
}
