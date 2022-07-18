package com.alkemy.disney.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.dto.GeneroDTO;
import com.alkemy.disney.etities.GeneroEntity;
import com.alkemy.disney.mapper.GeneroMapper;
import com.alkemy.disney.repository.GeneroRepository;
import com.alkemy.disney.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{
    
    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;


    public GeneroDTO save(GeneroDTO dto){
        //guardar genero entity
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entityGuardado = generoRepository.save(entity); // Algo aca hace que me tire un error 500
        GeneroDTO dtoDevuelto = generoMapper.generoEntity2DTO(entityGuardado);
        //retorno el dto como prueba de que funciona
        return dtoDevuelto;
    }

    public List<GeneroDTO> getAllGeneros(){
        List<GeneroEntity> generos = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(generos);
        return result;
    }
}
