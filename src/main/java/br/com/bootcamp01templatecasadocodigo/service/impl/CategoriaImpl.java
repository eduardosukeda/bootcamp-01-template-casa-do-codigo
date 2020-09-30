package br.com.bootcamp01templatecasadocodigo.service.impl;

import br.com.bootcamp01templatecasadocodigo.dto.CategoriaDTO;
import br.com.bootcamp01templatecasadocodigo.entity.Categoria;
import br.com.bootcamp01templatecasadocodigo.repository.CategoriaRepository;
import br.com.bootcamp01templatecasadocodigo.service.CategoriaService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaImpl implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public CategoriaDTO create(CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.save(new Categoria(categoriaDTO));
        return new CategoriaDTO(categoria);
    }
}
