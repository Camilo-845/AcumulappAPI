package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration; // For INTERVAL type

@Entity
@Table(name = "Cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

    @Column(nullable = false)
    private Duration expiration; // Maps to INTERVAL

    @Column(name = "maxStamp", nullable = false)
    private Integer maxStamp;

    @Column(nullable = false, length = 2000)
    private String description;
}