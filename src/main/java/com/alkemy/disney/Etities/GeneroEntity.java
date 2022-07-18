package com.alkemy.disney.etities;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "IMAGEN")
    private String imagen;

    private boolean deleted = Boolean.FALSE;

    @ManyToMany(mappedBy = "generos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})//({CascadeType.PERSIST, CascadeType.MERGE})
    private List<ContenidoAudiovisualEntity> contenidoAudiovisual = new ArrayList<>();
}
