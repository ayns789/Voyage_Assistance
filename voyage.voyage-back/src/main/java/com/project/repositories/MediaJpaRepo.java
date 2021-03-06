package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.Media;

@Repository
public interface MediaJpaRepo extends JpaRepository<Media, Long>{

}

