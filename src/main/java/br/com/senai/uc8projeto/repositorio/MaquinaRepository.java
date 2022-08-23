package br.com.senai.uc8projeto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.uc8projeto.model.Maquina;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina, Integer> {
	List<Maquina> findByDescricao(String descricao);
}
