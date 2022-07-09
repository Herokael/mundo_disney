package com.alkemy.disney.Etities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CONTENIDO_AUDIOVISUAL")
public class ContenidoAudiovisualEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "IMAGEN")
    private String imagen;

    @Column(name = "CALIFICACION")
    private int calificacion;

    @Column(name = "FECHA_CREACION")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

    @ManyToMany(
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        }
    )

    @JoinTable(
        name = "CONTENIDO_PERSONAJE",
        joinColumns = @JoinColumn(name = "CONTENIDO_ID"),
        inverseJoinColumns = @JoinColumn(name = "PERSONAJE_ID")
    )
    private List<PersonajeEntity> personajes = new ArrayList<>();

    // @ManyToMany(mappedBy = "GeneroEntity", cascade = CascadeType.ALL)
    // private List<GeneroEntity> generos = new ArrayList<>();
    @ManyToMany(
        cascade = CascadeType.ALL, 
        targetEntity = GeneroEntity.class
    )
    @JoinTable(
        name = "CONTENIDO_GENERO",
        joinColumns = @JoinColumn(name = "CONTENIDO_ID"),
        inverseJoinColumns = @JoinColumn(name = "GENERO_ID")
    )
    private List<GeneroEntity> generos = new ArrayList<>();
}
