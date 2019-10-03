package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;



@Entity
@Table(name="special_attention")
public class SpecialAttention extends AbstractEntityId {

	
	@NotBlank
	@Length( min = 3, max = 40)
	private String title;
	
	@NotBlank
	@Length( min = 3, max = 200)
	private String reference;
	
	public SpecialAttention() {
		
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
