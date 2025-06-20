package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idbusiness")
    private Business business;

    private Long expiration;

    @Column(name = "maxstamp")
    private Integer maxStamp;

    private String description;

    @OneToMany(mappedBy = "card",fetch = FetchType.LAZY)
    private List<CardUser> cardUsers;

}
