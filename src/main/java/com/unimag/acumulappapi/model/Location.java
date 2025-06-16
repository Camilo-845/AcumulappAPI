package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "Locations")
@Data
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