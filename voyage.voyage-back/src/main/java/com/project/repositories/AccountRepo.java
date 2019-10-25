package com.project.repositories;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.project.dtos.user.AccountDto;
import com.project.dtos.user.AccountViewDto;
import com.project.entities.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{


//	se servir d'un DTO pour afficher les infos que l'on souhaite
	AccountViewDto getById(Long id);

	List<AccountViewDto> getAllProjectBy();

	
//	Page<AccountViewDto> getAllProjectBy(Pageable pageable);
	
	@Query("select new com.project.dtos.user.AccountDto "
		    + " (a.firstName, a.lastName, a.loginAccount, a.passwordAccount, a.role, a.civility) " + " from Account a ")
	    Page<AccountDto> list(Pageable pageable);
	
	
}
