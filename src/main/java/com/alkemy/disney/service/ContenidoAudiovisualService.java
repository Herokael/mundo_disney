package com.alkemy.disney.service;

import java.util.List;

import com.alkemy.disney.dto.ContenidoAudiovisualDTO;

public interface ContenidoAudiovisualService {
    ContenidoAudiovisualDTO save(ContenidoAudiovisualDTO dto);
    List<ContenidoAudiovisualDTO> getAllContenido();
}
