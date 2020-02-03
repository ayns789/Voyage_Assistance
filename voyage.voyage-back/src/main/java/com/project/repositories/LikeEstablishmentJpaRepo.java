package com.project.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.LikeEstablishment;

@Repository
public interface LikeEstablishmentJpaRepo extends JpaRepository<LikeEstablishment, Long>{

	@Transactional
    public void deleteByLikerIdAndEstablishmentId(Long likerId, Long establishmentId);
}
