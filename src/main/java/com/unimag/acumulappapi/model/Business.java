package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "business")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idplan")
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "idlocation")
    private Location location;

    private String name;
    private String email;
    private String password;
    private String address;
    @Column(name = "logoimage")
    private String logoImage;

    @ManyToMany
    @JoinTable(name = "businesscategories", joinColumns = @JoinColumn(name = "idbusiness"),inverseJoinColumns = @JoinColumn(name = "idcategory"))
    private List<Category> categories;

    @OneToMany(mappedBy = "business",fetch = FetchType.LAZY)
    private List<Link> links;

    @OneToMany(mappedBy = "business",fetch = FetchType.LAZY)
    private List<Number> numbers;

    @OneToMany(mappedBy = "business",fetch = FetchType.LAZY)
    private List<CollaboratorActivity> collaboratorActivities;

    @OneToMany(mappedBy = "business",fetch = FetchType.LAZY)
    private List<Rating> ratings;

    @OneToMany(mappedBy = "business",fetch = FetchType.LAZY)
    private List<Card> cards;


}
