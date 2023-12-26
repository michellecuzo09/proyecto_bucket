package com.gt.proyect.RegistroGT.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "clave")
    private String clave;

    @Column(name = "email")
    private String email;

    @Column(name = "estado")
    private Boolean estado;

    @NonNull
    private String titulo;

    private String imagenPath;
    private String cedulaPath;

    @Transient
    private String imagenUrl;

    @Transient
    private String cedulaUrl;

}
