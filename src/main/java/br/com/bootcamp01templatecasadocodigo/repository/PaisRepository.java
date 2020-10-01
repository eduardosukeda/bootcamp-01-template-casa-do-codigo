package br.com.bootcamp01templatecasadocodigo.repository;

import br.com.bootcamp01templatecasadocodigo.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

    @Query(value = "select p from Pais p where p.id = :id")
    Pais findPaisById(Integer id);
}
