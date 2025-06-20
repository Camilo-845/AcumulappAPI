package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @Column(name = "idfather")
    private Integer father;

    @ManyToOne
    @JoinColumn(name = "idlocationtype")
    private LocationType locationType;

    @OneToMany(mappedBy = "location")
    private List<Business> businessList;


}
