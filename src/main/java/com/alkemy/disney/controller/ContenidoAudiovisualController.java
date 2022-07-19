package com.alkemy.disney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.disney.dto.ContenidoAudiovisualDTO;
import com.alkemy.disney.service.ContenidoAudiovisualService;

@RestController
@RequestMapping("contenidos")
public class ContenidoAudiovisualController {

    @Autowired
    private ContenidoAudiovisualService contenidoAudiovisualService;
    
    @PostMapping
    public ResponseEntity<ContenidoAudiovisualDTO> save(@RequestBody ContenidoAudiovisualDTO dto){
        //guardar en service
        ContenidoAudiovisualDTO contenidoGuardado = contenidoAudiovisualService.save(dto);
        //retornar estado
        return ResponseEntity.status(HttpStatus.CREATED).body(contenidoGuardado);
    }

    @GetMapping
    public ResponseEntity<List<ContenidoAudiovisualDTO>> getAll(){
        List<ContenidoAudiovisualDTO> contenidos = contenidoAudiovisualService.getAllContenido();
        return ResponseEntity.ok().body(contenidos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        contenidoAudiovisualService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
