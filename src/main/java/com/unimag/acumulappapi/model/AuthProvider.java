package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "AuthProviders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;
}