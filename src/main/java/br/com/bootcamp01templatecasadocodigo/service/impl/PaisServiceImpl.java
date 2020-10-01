package br.com.bootcamp01templatecasadocodigo.service.impl;

import br.com.bootcamp01templatecasadocodigo.dto.PaisDTO;
import br.com.bootcamp01templatecasadocodigo.entity.Pais;
import br.com.bootcamp01templatecasadocodigo.repository.PaisRepository;
import br.com.bootcamp01templatecasadocodigo.service.PaisService;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService {

    private PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public PaisDTO create(PaisDTO paisDTO) {
        Pais pais = paisRepository.save(new Pais(paisDTO));
        return new PaisDTO(pais);
    }
}
