package com.alkemy.disney.Etities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "GENERO")
public class GeneroEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "IMAGEN")
    private String imagen;

    // @ManyToMany(cascade = CascadeType.ALL, targetEntity = ContenidoAudiovisualEntity.class)
    // @JoinColumn(name = "CONTENIDO_ID")
    // private List<ContenidoAudiovisualEntity> contenidoAudiovisual = new ArrayList<>();

    @ManyToMany(
        cascade = CascadeType.ALL, 
        targetEntity = ContenidoAudiovisualEntity.class
    )
    @JoinTable(
        name = "CONTENIDO_GENERO",
        joinColumns = @JoinColumn(name = "GENERO_ID"),
        inverseJoinColumns = @JoinColumn(name = "CONTENIDO_ID")
    )
    private List<ContenidoAudiovisualEntity> contenidoAudiovisual = new ArrayList<>();
}
