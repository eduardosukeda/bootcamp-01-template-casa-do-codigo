package br.com.bootcamp01templatecasadocodigo.service.impl;

import br.com.bootcamp01templatecasadocodigo.dto.DetalheAutorDTO;
import br.com.bootcamp01templatecasadocodigo.dto.DetalheLivroDTO;
import br.com.bootcamp01templatecasadocodigo.dto.LivroDTO;
import br.com.bootcamp01templatecasadocodigo.entity.Livro;
import br.com.bootcamp01templatecasadocodigo.repository.AutorRepository;
import br.com.bootcamp01templatecasadocodigo.repository.CategoriaRepository;
import br.com.bootcamp01templatecasadocodigo.repository.LivroRepository;
import br.com.bootcamp01templatecasadocodigo.service.LivroService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    private LivroRepository livroRepository;

    private AutorRepository autorRepository;

    private CategoriaRepository categoriaRepository;

    public LivroServiceImpl(LivroRepository livroRepository, AutorRepository autorRepository, CategoriaRepository categoriaRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public LivroDTO create(LivroDTO livroDTO) {
        Livro livro = livroRepository.save(new Livro(livroDTO, autorRepository.getOne(livroDTO.getIdAutor()), categoriaRepository.getOne(livroDTO.getIdCategoria())));
        return new LivroDTO(livro, livroDTO.getIdAutor(), livroDTO.getIdCategoria());
    }

    @Override
    public List<LivroDTO> findAll() {
        List<LivroDTO> livrosDTO = new ArrayList<>();
        List<Livro> livros = livroRepository.findAll();

        for (Livro livro : livros) {
            livrosDTO.add(new LivroDTO(livro, livro.getAutor().getId(), livro.getCategoria().getId()));
        }

        return livrosDTO;
    }

    @Override
    public DetalheLivroDTO findLivroById(Integer id) {
        Livro livro = livroRepository.findLivroById(id);

        return new DetalheLivroDTO(new DetalheAutorDTO(livro.getAutor().getNome(), livro.getAutor().getDescricao()), livro);
    }
}