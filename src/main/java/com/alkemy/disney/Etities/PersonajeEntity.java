package com.alkemy.disney.etities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SQLDelete(sql = "DELETE PERSONAJE WHERE delete = true WHERE id=?") //Con esto provoco el borrado
@Where(clause = "deleted=false") //con esto diferencio los que fueron eliminados de los que no
@Table(name = "PERSONAJE")
public class PersonajeEntity {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    
    private boolean deleted = Boolean.FALSE;

    @ManyToMany(mappedBy = "personajes", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ContenidoAudiovisualEntity> contenidoaudiovisual = new ArrayList<>();
}
