package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idbusiness")
    private Business business;

    private String value;
}
