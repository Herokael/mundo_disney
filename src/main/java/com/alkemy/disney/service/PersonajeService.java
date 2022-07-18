package com.alkemy.disney.service;

import java.util.List;

import com.alkemy.disney.dto.PersonajeDTO;

public interface PersonajeService {
    PersonajeDTO save(PersonajeDTO dto);
    List<PersonajeDTO> getAllPersonajes();
    void delete(Long id);
}
