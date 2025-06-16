package com.unimag.acumulappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "UsersNotifications")
@Getter
@Setter
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