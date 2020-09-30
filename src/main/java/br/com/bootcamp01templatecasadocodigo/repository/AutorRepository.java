package br.com.bootcamp01templatecasadocodigo.repository;

import br.com.bootcamp01templatecasadocodigo.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}