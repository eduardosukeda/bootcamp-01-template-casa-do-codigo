package br.com.bootcamp01templatecasadocodigo.service;

import br.com.bootcamp01templatecasadocodigo.dto.LivroDTO;

import java.util.List;

public interface LivroService {

    LivroDTO create(LivroDTO livroDTO);

    List<LivroDTO> findAll();
}
