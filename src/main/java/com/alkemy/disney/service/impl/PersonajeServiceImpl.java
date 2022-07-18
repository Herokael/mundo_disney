package com.alkemy.disney.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.dto.PersonajeDTO;
import com.alkemy.disney.etities.PersonajeEntity;
import com.alkemy.disney.mapper.PersonajeMapper;
import com.alkemy.disney.repository.PersonajeRepository;
import com.alkemy.disney.service.PersonajeService;

@Service
public class PersonajeServiceImpl implements PersonajeService{
    
    @Autowired
    private PersonajeMapper personajeMapper;

    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeDTO save(PersonajeDTO dto){
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entityGuardada = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entityGuardada);
        return result;
    }

    public List<PersonajeDTO> getAllPersonajes(){
        List<PersonajeEntity> personajes = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeListEntity2ListDTO(personajes);
        return result; 
    }

    public void delete(Long id){
        personajeRepository.deleteById(id);
    }
}
