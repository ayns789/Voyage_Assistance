package com.project.dtos.admin;

import com.project.entities.Address;
import com.project.entities.Category;

public class EstablishmentCreateDto {
	
	private String name;
	
	private String descriptive;

	private int capacity;

	private Category category;
	
	private Address address;

	public EstablishmentCreateDto() {
		
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
