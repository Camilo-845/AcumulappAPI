package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "fullname")
    private String fullName;

    private String email;

    private String password;

    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "provideruserid")
    private String providerUserId;

    @Column(name = "emailverified")
    private boolean emailVerified;

    @Column(name = " profileimageurl")
    private String profilePicture;

    @ManyToOne
    @JoinColumn(name = "idauthprovider")
    private AuthProvider authProvider;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usersnotifications",
            joinColumns = @JoinColumn(name = "iduser"), inverseJoinColumns = @JoinColumn(name="idnotification"))
    private List<Notification> notifications;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "preferences",joinColumns = @JoinColumn(name = "iduser"), inverseJoinColumns = @JoinColumn(name = "idcategory"))
    private List<Category> categories;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "collaborators",joinColumns = @JoinColumn(name="iduser"),
    inverseJoinColumns = @JoinColumn(name="idbusiness"))
    private List<Business> businessList;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<CollaboratorActivity> collaboratorActivities;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<Rating> ratings;

    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    private List<CardUser> cardUsers;


}
