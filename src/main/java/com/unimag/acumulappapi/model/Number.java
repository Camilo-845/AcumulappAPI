package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

    @Column(nullable = false, length = 20)
    private String value;
}