package com.project.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State extends AbstractEntityId {
	

	private Integer codeState;
	
	private String libState;
	
	@OneToMany
	@JoinColumn
	private List<Region> regions;
	
	public State() {
		
	}

	public Integer getCodeState() {
		return codeState;
	}

	public void setCodeState(Integer codeState) {
		this.codeState = codeState;
	}

	public String getLibState() {
		return libState;
	}

	public void setLibState(String libState) {
		this.libState = libState;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	
}
