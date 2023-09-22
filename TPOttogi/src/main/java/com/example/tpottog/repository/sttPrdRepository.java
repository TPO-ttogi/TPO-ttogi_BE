package com.example.tpottog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface sttPrdRepository extends JpaRepository<sttPrd, Long> {
    List<sttPrd> findBySituation(Situation situation);
}
