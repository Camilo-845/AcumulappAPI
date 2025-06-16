package com.unimag.acumulappapi.model;

import com.unimag.acumulappapi.model.Location;
import com.unimag.acumulappapi.model.Plan;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "Business")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idPlan", nullable = false)
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "idLocation", nullable = false)
    private Location location;

    @Column(nullable = false, length = 80)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "logoImage", length = 500)
    private String logoImage;

    @Column(name = "Address", length = 250)
    private String address;
}