package com.alkemy.disney.Etities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PERSONAJE")
public class PersonajeEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name ="HISTORIA")
    private String historia;

    @Column(name = "EDAD")
    private int edad;

    @Column(name = "PESO")
    private float peso;

    @Column(name = "IMAGEN")
    private String imagen;
    
    @ManyToMany
    private List<ContenidoAudiovisualEntity> paises = new ArrayList<>();
}
