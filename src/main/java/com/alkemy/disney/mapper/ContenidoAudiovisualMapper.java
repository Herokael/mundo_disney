package com.alkemy.disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.disney.dto.ContenidoAudiovisualDTO;
import com.alkemy.disney.etities.ContenidoAudiovisualEntity;

@Component
public class ContenidoAudiovisualMapper {
    
    public ContenidoAudiovisualDTO contenidoAudiovisualEntity2DTO(ContenidoAudiovisualEntity entity){
        ContenidoAudiovisualDTO dto = new ContenidoAudiovisualDTO();
        dto.setId(entity.getId());
        dto.setTitulo(entity.getTitulo());
        dto.setImagen(entity.getImagen());
        dto.setCalificacion(entity.getCalificacion());
        dto.setFechaCreacion(entity.getFechaCreacion());
        return dto;
    }

    public ContenidoAudiovisualEntity contenidoAudiovisualDTO2Entity(ContenidoAudiovisualDTO dto){
        ContenidoAudiovisualEntity entity = new ContenidoAudiovisualEntity();
        entity.setTitulo(dto.getTitulo());
        entity.setImagen(dto.getImagen());
        entity.setCalificacion(dto.getCalificacion());
        entity.setFechaCreacion(dto.getFechaCreacion());
        return entity;
    }

    public List<ContenidoAudiovisualDTO> contenidoEntityList2DTOList(List<ContenidoAudiovisualEntity> entities){
        List<ContenidoAudiovisualDTO> dtos = new ArrayList<>();
        for(ContenidoAudiovisualEntity entity : entities){
            dtos.add(contenidoAudiovisualEntity2DTO(entity));
        }
        return dtos;
    }
}
