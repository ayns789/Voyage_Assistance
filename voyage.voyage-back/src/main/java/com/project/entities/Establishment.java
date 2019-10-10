package com.project.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_establishment")
public class Establishment extends AbstractEntityId {
	

	@NotBlank
	@Column(length=50, name="name_establishment")
	private String name;
	
	@NotBlank
	@Column(length=800)
	private String descriptive;
	
	@NotNull
	private int capacity;
	
	@OneToMany
	@JoinColumn(name="address_id")
	private List<Address> addresses;
	
	
	
	@OneToMany
	 @JoinTable(
	       name = "t_establishment_activity",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "activity_id")
	    )
	private List<Activity> activities;
	
	
	@OneToMany
	 @JoinTable(
	       name = "t_establishment_service",
	       joinColumns = @JoinColumn(name = "establishment_id"),
	       inverseJoinColumns = @JoinColumn(name = "service_id")
	    )
	private List<Service> services;
	

	
	public Establishment() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptive() {
		return descriptive;
	}

	public void setDescriptive(String descriptive) {
		this.descriptive = descriptive;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	public List<Activity> getActivities() {
		return activities;
	}


	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	public List<Service> getServices() {
		return services;
	}


	public void setServices(List<Service> services) {
		this.services = services;
	}
	
}
