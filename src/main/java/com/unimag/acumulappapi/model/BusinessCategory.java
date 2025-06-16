package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BusinessCategories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessCategory {

    @Id
    @ManyToOne
    @JoinColumn(name = "idBusiness", nullable = false)
    private Business business;

    @Id
    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;
}
