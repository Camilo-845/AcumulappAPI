package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "UsersNotifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idNotification", nullable = false)
    private Notification notification;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Cliente cliente;
}