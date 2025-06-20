package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cardsusers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idcard")
    private Card card;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idcardstate")
    private CardState cardState;

    @Column(name = "expirationdate")
    private LocalDateTime expirationDate;

    @Column(name = "currentstamps")
    private Integer currentStamp;

    @Column(name = "uniquecode")
    private String uniCode;
}
