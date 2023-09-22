package com.example.tpottogi.entity;

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

    private String name_en;

    private String name_kr;

    private String link;

    private String feature;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="stt_id")
    private Situation situation;
}
