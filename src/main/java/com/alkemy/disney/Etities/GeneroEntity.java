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

    @ManyToMany(mappedBy = "generos", cascade = CascadeType.ALL)
    private List<ContenidoAudiovisualEntity> contenidoAudiovisual = new ArrayList<>();
}
