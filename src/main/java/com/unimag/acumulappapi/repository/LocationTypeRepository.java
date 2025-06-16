package com.unimag.acumulappapi.repository;

import com.unimag.acumulappapi.model.LocationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationTypeRepository extends JpaRepository<LocationType, Long> {
} 