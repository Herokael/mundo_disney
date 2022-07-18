package com.alkemy.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.disney.dto.PersonajeDTO;
import com.alkemy.disney.etities.PersonajeEntity;

@Component
public class PersonajeMapper {
    
    public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity){
        PersonajeDTO dto = new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setImagen(entity.getImagen());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        return dto;
    }

    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto){
        PersonajeEntity entity = new PersonajeEntity();
        entity.setNombre(dto.getNombre());
        entity.setImagen(dto.getImagen());
        entity.setEdad(dto.getEdad());
        entity.setPeso(dto.getPeso());
        entity.setHistoria(dto.getHistoria());
        return entity;
    }

    public List<PersonajeDTO> personajeListEntity2ListDTO(List<PersonajeEntity> entities){
        List<PersonajeDTO> dtos = new ArrayList<>();
        for(PersonajeEntity entity : entities){
            dtos.add(personajeEntity2DTO(entity));
        }
        return dtos;
    }
}
