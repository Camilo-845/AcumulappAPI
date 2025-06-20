package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "locationtypes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @OneToMany(mappedBy = "locationType",fetch = FetchType.LAZY)
    private List<Location> locations;


}
