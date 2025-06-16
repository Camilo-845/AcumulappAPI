package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idFather", nullable = false)
    private Location fatherLocation; // Self-referencing relationship

    @ManyToOne
    @JoinColumn(name = "idLocationType", nullable = false)
    private LocationType locationType;

    @Column(nullable = false)
    private String name;
}