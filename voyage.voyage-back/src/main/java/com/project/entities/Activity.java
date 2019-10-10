package com.project.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="t_activity")
public class Activity extends AbstractEntityId {
	

	@NotBlank
	@Length( min = 3, max = 40)
	private String categoryActivity;
	
	
	public Activity() {
		
	}


	public String getNameActivity() {
		return categoryActivity;
	}

	public void setNameActivity(String nameActivity) {
		this.categoryActivity = nameActivity;

	}


}
