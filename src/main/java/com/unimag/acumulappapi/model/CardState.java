package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cardstates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @OneToMany(mappedBy = "cardState",fetch = FetchType.LAZY)
    private List<CardUser> cardUsers;
}
