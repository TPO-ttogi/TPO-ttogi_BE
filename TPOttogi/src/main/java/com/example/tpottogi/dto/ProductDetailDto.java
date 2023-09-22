package com.example.tpottogi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductDetailDto {
    private Long id;

    private String name_en; //제품명

    private String food_en; //음식명(영문)

    private String food_kr; //음식명(한글)

    private String imageUrl;

    public ProductDetailDto(Long id, String name_en, String food_en, String food_kr, String imageUrl) {
        this.id = id;
        this.name_en = name_en;
        this.food_en = food_en;
        this.food_kr = food_kr;
        this.imageUrl = imageUrl;
    }
}
