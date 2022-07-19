package com.alkemy.disney.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.dto.ContenidoAudiovisualDTO;
import com.alkemy.disney.etities.ContenidoAudiovisualEntity;
import com.alkemy.disney.mapper.ContenidoAudiovisualMapper;
import com.alkemy.disney.repository.ContenidoAudiovisualRepository;
import com.alkemy.disney.service.ContenidoAudiovisualService;

@Service
public class ContenidoAudiovisualServiceImpl implements ContenidoAudiovisualService{
    
    @Autowired
    private ContenidoAudiovisualMapper contenidoAudiovisualMapper;

    @Autowired
    private ContenidoAudiovisualRepository contenidoAudiovisualRepository;

    public ContenidoAudiovisualDTO save(ContenidoAudiovisualDTO dto){
        ContenidoAudiovisualEntity entity = contenidoAudiovisualMapper.contenidoAudiovisualDTO2Entity(dto);
        ContenidoAudiovisualEntity entityGuardado = contenidoAudiovisualRepository.save(entity);
        ContenidoAudiovisualDTO result = contenidoAudiovisualMapper.contenidoAudiovisualEntity2DTO(entityGuardado);
        return result;
    }

    public List<ContenidoAudiovisualDTO> getAllContenido(){
        List<ContenidoAudiovisualEntity> contenidos = contenidoAudiovisualRepository.findAll();
        List<ContenidoAudiovisualDTO> result = contenidoAudiovisualMapper.contenidoEntityList2DTOList(contenidos);
        return result;
    }

    public void delete(Long id){
        contenidoAudiovisualRepository.deleteById(id);
    }
}
