package com.example.tpottogi.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name_en; //제품명

    private String food_en; //음식명(영문)

    private String food_kr; //음식명(한글)

    private String link;

    private String feature;

    private String sessionAvg;

}