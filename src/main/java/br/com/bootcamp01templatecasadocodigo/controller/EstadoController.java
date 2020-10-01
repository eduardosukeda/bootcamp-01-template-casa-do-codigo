package br.com.bootcamp01templatecasadocodigo.controller;

import br.com.bootcamp01templatecasadocodigo.dto.EstadoDTO;
import br.com.bootcamp01templatecasadocodigo.service.EstadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/estados")
public class EstadoController {

    private EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @PostMapping
    public EstadoDTO create(@RequestBody @Valid EstadoDTO estadoDTO) {
        return estadoService.create(estadoDTO);
    }
}
