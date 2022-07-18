package com.alkemy.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.disney.etities.ContenidoAudiovisualEntity;

@Repository
public interface ContenidoAudiovisualRepository extends JpaRepository<ContenidoAudiovisualEntity, Long>{
    
}
