package br.com.senai.uc8projeto.repositorio;

import br.com.senai.uc8projeto.model.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina, Integer> {
}
