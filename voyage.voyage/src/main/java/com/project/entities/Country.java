package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country extends AbstractEntityId implements Comparable<Country> {
	
	
	private String code;
    private String name;

    public Country(String code, String name) {
        super();
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }

}
