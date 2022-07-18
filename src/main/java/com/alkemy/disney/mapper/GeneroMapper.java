package com.alkemy.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.disney.dto.GeneroDTO;
import com.alkemy.disney.etities.GeneroEntity;

@Component
public class GeneroMapper {
    
    public GeneroEntity generoDTO2Entity(GeneroDTO dto){
        GeneroEntity entity = new GeneroEntity();
        entity.setNombre(dto.getNombre());
        entity.setImagen(dto.getImagen());
        return entity;
    }

    public GeneroDTO generoEntity2DTO(GeneroEntity entity){
        GeneroDTO dto = new GeneroDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setImagen(entity.getImagen());
        return dto;
    }

    public List<GeneroDTO> generoEntityList2DTOList(List<GeneroEntity> entities){
        List<GeneroDTO> dtos = new ArrayList<>();
        for(GeneroEntity entity : entities){
            dtos.add(generoEntity2DTO(entity));
        }
        return dtos;
    }
}
