package com.example.tpottogi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituationRepository extends JpaRepository<Situation, Long> {
}