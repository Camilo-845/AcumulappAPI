package com.unimag.acumulappapi.repository;

import com.unimag.acumulappapi.model.CardState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardStateRepository extends JpaRepository<CardState, Long> {
} 