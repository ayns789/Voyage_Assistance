package com.project.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="establishment")
public class Establishment extends AbstractEntityId {
	

	@NotBlank
	@Column(length=50)
	private String name;
	
	@NotBlank
	@Column(length=300)
	private String descriptive;
	
	@NotNull
	private int capacity;
	
	@OneToMany
	@JoinColumn
	private List<Address> addresses;
	
	@OneToMany
	@JoinColumn
	private List<Email> emails;
	
//	@OneToMany
//	@JoinColumn(name = "establishment_id")
//	private List<Phone> phones;
	
	@OneToMany
	@JoinColumn
	private List<Activity> activities;
	
	@OneToMany
	@JoinColumn
	private List<Media> medias;
	
	@OneToMany
	@JoinColumn
	private List<Service> services;
	
//	@JsonIgnore
//	@OneToMany
////	@JoinColumn(name = "id_booking", referencedColumnName = "id_booking")
//	private List<Booking> bookings;
	
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


	public List<Email> getEmails() {
		return emails;
	}


	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
//
//
//	public List<Phone> getPhones() {
//		return phones;
//	}
//
//
//	public void setPhones(List<Phone> phones) {
//		this.phones = phones;
//	}
//

	public List<Activity> getActivities() {
		return activities;
	}


	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	public List<Media> getMedias() {
		return medias;
	}


	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}


	public List<Service> getServices() {
		return services;
	}


	public void setServices(List<Service> services) {
		this.services = services;
	}
	
}
