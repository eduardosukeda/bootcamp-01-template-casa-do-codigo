package br.com.bootcamp01templatecasadocodigo.repository;

import br.com.bootcamp01templatecasadocodigo.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}