package com.project.dtos;

import java.util.Set;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.project.entities.Account;
import com.project.entities.Role;

/**
 * A projection of a {@code CustomUser} for authentication.
 */
@JsonDeserialize(as= Account.class)
public interface AccountAuthViewDto {

    Long getId();

    String getUsername();

    String getPassword();

    Set<Role> getRoles();

    boolean isEnabled();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();
}
