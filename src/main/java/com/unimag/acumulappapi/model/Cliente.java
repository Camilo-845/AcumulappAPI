package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "idAuthProvider", nullable = false)
    private AuthProvider authProvider;

    @Column(nullable = false)
    private Boolean isActive;

    @Column(name = "providerUserId", unique = true)
    private String providerUserId;

    @Column(name = "emailVerified", nullable = false)
    private Boolean emailVerified = false;

    @Column(name = "profileImageUrl")
    private String profileImageUrl;
}