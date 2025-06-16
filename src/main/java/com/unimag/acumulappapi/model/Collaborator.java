package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Collaborators")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Collaborator {

    @Id
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente cliente;

    @Id
    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

}
