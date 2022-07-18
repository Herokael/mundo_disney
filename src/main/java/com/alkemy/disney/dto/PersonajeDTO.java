package com.alkemy.disney.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class PersonajeDTO {
    private Long id;
    private String nombre;

    private String historia;

    private int edad;

    private float peso;

    private String imagen;
}
