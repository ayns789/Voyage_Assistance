package com.project.services;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;


import com.project.dtos.AccountCreateDto;
import com.project.dtos.AccountViewDto;
import com.project.dtos.AccountUpDelDto;

public interface AccountDetailsService extends UserDetailsService {

    AccountViewDto getCurrentUserInfo(Long id);
    
    void delete(Long id);

//    void update(Long id, AccountUpDelDto account);

	List<AccountViewDto> getAll();
	
    /**
     * Creates and saves a new {@code CustomUser} with given credentials ans
     * default role.
     *
     * @param dto a new user credentials
     * @throws Exception if a {@code CustomUser} already exists with given
     *                   username
     */
     void create(AccountCreateDto dto, PasswordEncoder passwordEncoder);
     
     

    /**
     * Indicates whether or not a {@code CustomUser} already exists with given
     * username.
     *
     * @param username a username
     * @return {@code true} if no {@code CustomUser} already exists with given
     *         username; {@code false} otherwise
     */
    boolean usernameIsUnique(String username);

    AccountCreateDto one(Long id);

	void updateAccount(Long id, AccountUpDelDto dto);

//	String deleteTest(String id);


//	ResponseEntity<Account> updateAccount(Long id, @Valid AccountUpDelDto account);

//	ResponseEntity<Account> updateAccount(long id, @Valid AccountUpDelDto account);


}
