package com.alkemy.disney.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContenidoAudiovisualDTO {
    private Long id;

    private String titulo;

    private String imagen;

    private int calificacion;

    private LocalDate fechaCreacion;
}
