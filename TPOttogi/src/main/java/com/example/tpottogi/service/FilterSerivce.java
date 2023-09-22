package com.example.tpottogi.service;

import com.example.tpottogi.repository.ProductRepository;
import com.example.tpottogi.repository.SituationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilterSerivce {
    private final ProductRepository productRepository;
    private final SituationRepository situationRepository;

    @Autowired
    public FilterSerivce(ProductRepository productRepository, SituationRepository situationRepository) {
        this.productRepository = productRepository;
        this.situationRepository = situationRepository;
    }
}