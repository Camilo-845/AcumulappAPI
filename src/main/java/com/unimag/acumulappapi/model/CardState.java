package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CardStates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;
}