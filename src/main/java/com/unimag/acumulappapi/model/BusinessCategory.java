package com.unimag.acumulappapi.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "BusinessCategories")
@Data
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
