package com.unimag.acumulappapi.repository;

import com.unimag.acumulappapi.model.ActionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionTypeRepository extends JpaRepository<ActionType, Long> {
} 