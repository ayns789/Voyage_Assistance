package com.project.dtos;

/**
 * A projection of a {@code CustomUser} for user info.
 */
public interface AccountViewDto {

	Long getId();

	String getUsername();

	String getFirstName();

	String getLastName();
	
	
}
