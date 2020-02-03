package com.project.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.project.services.AccountDetailsService;

public class UniqueUsernameValidator
	implements ConstraintValidator<UniqueUsername, String> {

    private final AccountDetailsService service;

    protected UniqueUsernameValidator(AccountDetailsService userService) {
	service = userService;
    }

    @Override
    public boolean isValid(String username,
                           ConstraintValidatorContext constraintValidatorContext) {
	if (null == username || username.isEmpty()) {
	    return true;
	}
	return service.usernameIsUnique(username);
    }
}
