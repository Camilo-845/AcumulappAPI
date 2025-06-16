package com.unimag.acumulappapi.repository;

import com.unimag.acumulappapi.model.BusinessCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessCategoryRepository extends JpaRepository<BusinessCategory, Long> {
} 