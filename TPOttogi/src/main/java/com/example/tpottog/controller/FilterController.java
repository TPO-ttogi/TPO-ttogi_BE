package com.example.tpottog.controller;

import com.example.tpottog.Service.FilterSerivce;
import com.example.tpottog.dto.ProductDetailDto;
import com.example.tpottog.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FilterController {
    private final FilterSerivce filterSerivce;

    @GetMapping("/keyword/{id}")
    public List<ProductDto> keywordFoods(@PathVariable Long id) {
        return filterSerivce.keywordFoods(id);
    }

    @GetMapping("/product/{id}")
    public ProductDetailDto productDetail(@PathVariable Long id){
        return filterSerivce.productDetail(id);
    }

}