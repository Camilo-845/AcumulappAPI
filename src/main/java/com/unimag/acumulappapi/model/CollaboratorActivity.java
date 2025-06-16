package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CollaboratorsActivities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollaboratorActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

    @ManyToOne
    @JoinColumn(name = "idActionType", nullable = false)
    private ActionType actionType;

    @Column(name = "oldValue", length = 255)
    private String oldValue;

    @Column(name = "newValue", length = 255)
    private String newValue;
}
