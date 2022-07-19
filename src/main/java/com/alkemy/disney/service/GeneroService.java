package com.alkemy.disney.service;

import java.util.List;

import com.alkemy.disney.dto.GeneroDTO;

public interface GeneroService {
    GeneroDTO save(GeneroDTO genero);
    List<GeneroDTO> getAllGeneros();
    void delete(Long id);
}
