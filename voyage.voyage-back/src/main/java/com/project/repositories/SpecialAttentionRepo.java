package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.SpecialAttention;

@Repository
public interface SpecialAttentionRepo extends JpaRepository<SpecialAttention, Long>{

}
