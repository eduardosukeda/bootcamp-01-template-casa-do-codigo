package br.com.bootcamp01templatecasadocodigo.controller;

import br.com.bootcamp01templatecasadocodigo.dto.PaisDTO;
import br.com.bootcamp01templatecasadocodigo.service.PaisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/paises")
public class PaisController {

    private PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @PostMapping
    public PaisDTO create(@RequestBody @Valid PaisDTO paisDTO) {
        return paisService.create(paisDTO);
    }
}
