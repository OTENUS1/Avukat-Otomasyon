package com.example.demoo.Entities.Concrates;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Kullanıcı")
@AllArgsConstructor
@NoArgsConstructor
public class Kullanıcı {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private int rol;

    @Column(name = "photo_url")
    private String photoUrl;

}
