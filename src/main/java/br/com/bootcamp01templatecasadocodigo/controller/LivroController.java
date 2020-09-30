package br.com.bootcamp01templatecasadocodigo.controller;

import br.com.bootcamp01templatecasadocodigo.dto.LivroDTO;
import br.com.bootcamp01templatecasadocodigo.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public ResponseEntity<LivroDTO> create(@RequestBody @Valid LivroDTO request) {
        return ResponseEntity.ok(livroService.create(request));
    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll() {
        return ResponseEntity.ok(livroService.findAll());
    }
}
