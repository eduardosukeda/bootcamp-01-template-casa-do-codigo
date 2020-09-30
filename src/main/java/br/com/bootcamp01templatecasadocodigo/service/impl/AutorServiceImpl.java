package br.com.bootcamp01templatecasadocodigo.service.impl;

import br.com.bootcamp01templatecasadocodigo.dto.AutorDTO;
import br.com.bootcamp01templatecasadocodigo.entity.Autor;
import br.com.bootcamp01templatecasadocodigo.repository.AutorRepository;
import br.com.bootcamp01templatecasadocodigo.service.AutorService;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl implements AutorService {

    private AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public AutorDTO create(AutorDTO autorDTO) {
        Autor autor = autorRepository.save(new Autor(autorDTO));
        return new AutorDTO(autor);
    }
}
