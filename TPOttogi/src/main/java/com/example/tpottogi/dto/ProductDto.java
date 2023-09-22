package com.example.tpottogi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductDto {
    private Long id;

    private String imageUrl;

    private String name_en;

    public ProductDto(Long id, String imageUrl, String name_en) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name_en = name_en;
    }
}
