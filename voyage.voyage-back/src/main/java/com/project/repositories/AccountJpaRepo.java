package com.project.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.dtos.AccountAuthViewDto;
import com.project.dtos.AccountViewDto;
import com.project.entities.Account;

@Repository
public interface AccountJpaRepo
	extends JpaRepository<Account, Long> {
	
	List<AccountViewDto> getAllProjectBy();

    /**
     * Retrieves a projected view of the {@code CustomUser} with given username.
     *
     * @param username a username
     * @return a projected view
     */
    Optional<AccountAuthViewDto> findByUsername(String username);
    
    

    /**
     * Retrieves a projected view of the current authenticated
     * {@code CustomUser}.
     *
     * @param id user id
     * @return a projected view
     */
    Optional<AccountViewDto> getById(Long id);

    boolean existsByUsernameIgnoreCase(String username);
}
