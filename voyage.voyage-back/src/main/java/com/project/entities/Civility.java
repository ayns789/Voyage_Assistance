package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="t_civility")
public class Civility extends AbstractEntityId {
	

	
	
	@Column(name="civ_libelle")
	private String libCivility;
	
//	@Convert(converter = BooleanConverter.class)
//    @Column(length = 1, nullable = false, name="civ_default_civility")
//    private boolean defaultCivility = false;
	
//	@OneToMany(mappedBy="civility", cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
//    private List<Account> account;
	
	protected Civility() {
		
	}
	
	@Override
	public String toString() {
		return "Civility [id=" + id + ", libCivility=" + libCivility + "]";
	}

	public Civility(String libCivility) {
		setLibCivility(libCivility);
	}
	
	public Long getId() {
		return id;
	}

	public String getLibCivility() {
		return libCivility;
	}

	public void setLibCivility(String libCivility) {
		this.libCivility = libCivility;
	}

//	public boolean isDefaultCivility() {
//		return defaultCivility;
//	}
//
//	public void setDefaultCivility(boolean defaultCivility) {
//		this.defaultCivility = defaultCivility;
//	}


}
