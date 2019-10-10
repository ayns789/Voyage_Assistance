package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;



@Entity
@Table(name="t_special_attention")
public class SpecialAttention extends AbstractEntityId {

	
	@NotBlank
	@Length( min = 3, max = 40)
	private String title;
	
	@NotBlank
	@Length( min = 3, max = 200)
	private String reference;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="activity_id")
	private Activity activity;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="service_id")
	private Service service;
	
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

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
