package com.project.entities;

import javax.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, String> {

	    @Override
	    public String convertToDatabaseColumn(Boolean value) {
		return Boolean.TRUE.equals(value) ? "True" : "False";
	    }

	    // conversion en sens inverse, à partir de la base de données
	    @Override
	    public Boolean convertToEntityAttribute(String value) {
		return "True".equals(value);
	    }
	
}
