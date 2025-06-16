package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "CardsUsers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente user;

    @ManyToOne
    @JoinColumn(name = "idCard", nullable = false)
    private Card card;

    @ManyToOne
    @JoinColumn(name = "idCardState", nullable = false)
    private CardState cardState;

    @Column(name = "expirationDate", nullable = false)
    private LocalDateTime expirationDate;

    @Column(name = "currentStamps", nullable = false)
    private Integer currentStamps;

    @Column(name = "UniqueCode", length = 8)
    private String uniqueCode;
}