package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="t_role")
public class Role extends AbstractEntityId {
	
	
	private String libRole;

//	@OneToOne
//    @MapsId
//    private Account account;
	
	public Role() {
		
	}
	
	

	@Override
	public String toString() {
		return "Role [libRole=" + libRole + "]";
	}



	public String getLibRole() {
		return libRole;
	}

	public void setLibRole(String libRole) {
		this.libRole = libRole;
	}

//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	
	

}
