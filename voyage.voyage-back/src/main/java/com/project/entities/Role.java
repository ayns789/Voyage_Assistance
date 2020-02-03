package com.project.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_role")
public class Role extends AbstractEntityId {


    @Column(length = 256, nullable = false, unique = true, name="rol_libelle")
    private String code;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 1, nullable = false, name="rol_default_role")
    private boolean defaultRole = false;
    

    protected Role() {
	// Empty no-arg constructor for JPA
    }

    public Role(String code) {
	setCode(code);
    }

    public Long getId() {
	return id;
    }
    

	public void setDefaultRole(boolean defaultRole) {
		this.defaultRole = defaultRole;
	}

	public String getCode() {
	return code;
    }

    private void setCode(String code) {
	this.code = code;
    }

    public boolean isDefaultRole() {
	return defaultRole;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", code=" + code + "}";
    }
}
