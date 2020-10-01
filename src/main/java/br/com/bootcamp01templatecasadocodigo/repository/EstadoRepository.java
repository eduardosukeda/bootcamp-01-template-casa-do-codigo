package br.com.bootcamp01templatecasadocodigo.repository;

import br.com.bootcamp01templatecasadocodigo.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}