package com.example.tpottogi.controller;

import com.example.tpottogi.service.FilterSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FilterController {
    private final FilterSerivce filterSerivce;

//    @GetMapping("/keyword/{id}")
}