package br.com.bootcamp01templatecasadocodigo.controller;

import br.com.bootcamp01templatecasadocodigo.dto.AutorDTO;
import br.com.bootcamp01templatecasadocodigo.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/autores")
public class AutorController {

    private AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public ResponseEntity<AutorDTO> create(@RequestBody @Valid AutorDTO request) {
        return ResponseEntity.ok(autorService.create(request));
    }
}
