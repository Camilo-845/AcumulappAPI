package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "Preferences")
@Data
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