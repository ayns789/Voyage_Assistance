package com.project.repositories;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountViewDto;
import com.project.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{


//	se servir d'un DTO pour afficher les infos que l'on souhaite
	AccountViewDto getById(Long id);

	List<AccountViewDto> getAllProjectBy();

	// pour pagination dynamique suivie dans AccountRepoImpl
//	List<AccountDto> findPageResultsByAccountId(long id, int offset, int limit);
	
	
	
	    
//	Page<AccountViewDto> getAllProjectBy(Pageable pageable);
	@Transactional
	@Query("select new com.project.dtos.user.AccountDto "
		    + " ( a.firstName, a.lastName, a.login, a.password, a.role, a.civility) " + " from Account a ")
	    Page<AccountDto> list(Pageable pageable);
	
	

}
