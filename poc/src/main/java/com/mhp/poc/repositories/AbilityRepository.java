package com.mhp.poc.repositories;

import com.mhp.poc.entities.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<AbilityEntity , Long> {
}
