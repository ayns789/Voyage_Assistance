package com.project.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntityId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected AbstractEntityId() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
	
	/*
	 * toto t = neww toto
	 * t.create.
	 * t.getId
	 */
    }
}
