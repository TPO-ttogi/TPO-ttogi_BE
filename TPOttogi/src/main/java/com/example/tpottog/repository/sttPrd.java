package com.example.tpottog.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@IdClass(sttPrdId.class)
@Table(name = "stt_prd")
public class sttPrd {
    @Id
    @ManyToOne
    @JoinColumn(name = "stt_id")
    private Situation situation;

    @Id
    @ManyToOne
    @JoinColumn(name = "prd_id")
    private Product product;
}
