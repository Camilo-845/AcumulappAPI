package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "collaboratorsactivities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollaboratorActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idbusiness")
    private Business business;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idactiontype")
    private ActionType actionType;

    @Column(name = "oldvalue")
    private String oldValue;

    @Column(name="newvalue")
    private String newValue;

}
