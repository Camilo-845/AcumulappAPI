package com.unimag.acumulappapi.repository;

import com.unimag.acumulappapi.model.CardUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardUserRepository extends JpaRepository<CardUser, Long> {
} 