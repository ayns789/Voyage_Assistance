package com.project.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Validates if a username is unique or not.
 * <p>
 * Accepted type is {@code String}.
 * <p>
 * Uniquness is tested if and only if the value is neither {@code null} nor
 * empty. That said <b>a {@code null} or empty value is considered as valid</b>.
 * Other validation should be used to check against {@code null} and empty
 * values.
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE,
	ElementType.PARAMETER })
@Constraint(validatedBy = UniqueUsernameValidator.class)
public @interface UniqueUsername {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
