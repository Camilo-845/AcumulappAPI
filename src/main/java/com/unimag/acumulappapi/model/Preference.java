package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Preferences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Preference {

    @Id
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente cliente;

    @Id
    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

}