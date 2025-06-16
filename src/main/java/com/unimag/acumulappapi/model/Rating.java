package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Ratings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

    @Column(nullable = false)
    private Short valoration = 5; // SMALLINT, default 5, check constraint will be handled by DB
}