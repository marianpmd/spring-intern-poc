package com.mhp.poc.repositories;

import com.mhp.poc.entities.TriviaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriviaRepository extends JpaRepository<TriviaEntity,Long> {
}
