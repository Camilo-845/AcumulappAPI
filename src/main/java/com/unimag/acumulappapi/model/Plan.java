package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Plans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;
}
