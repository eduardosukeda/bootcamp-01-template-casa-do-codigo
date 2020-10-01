package br.com.bootcamp01templatecasadocodigo.service.impl;

import br.com.bootcamp01templatecasadocodigo.dto.EstadoDTO;
import br.com.bootcamp01templatecasadocodigo.entity.Estado;
import br.com.bootcamp01templatecasadocodigo.entity.Pais;
import br.com.bootcamp01templatecasadocodigo.repository.EstadoRepository;
import br.com.bootcamp01templatecasadocodigo.repository.PaisRepository;
import br.com.bootcamp01templatecasadocodigo.service.EstadoService;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {

    private EstadoRepository estadoRepository;

    private PaisRepository paisRepository;

    public EstadoServiceImpl(EstadoRepository estadoRepository, PaisRepository paisRepository) {
        this.estadoRepository = estadoRepository;
        this.paisRepository = paisRepository;
    }

    @Override
    public EstadoDTO create(EstadoDTO estadoDTO) {
        Pais pais = paisRepository.findPaisById(estadoDTO.getIdPais());
        Estado estado = estadoRepository.save(new Estado(estadoDTO, pais));

        return new EstadoDTO(estado, pais);
    }
}
