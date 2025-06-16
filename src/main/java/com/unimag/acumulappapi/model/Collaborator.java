package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;

@Entity
@Table(name = "Collaborators")
@Data
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
