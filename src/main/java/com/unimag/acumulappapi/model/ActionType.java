package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "actiontypes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @OneToMany(mappedBy = "actionType", fetch = FetchType.LAZY)
    private List<CollaboratorActivity> collaboratorActivities;
}
