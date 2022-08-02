package br.com.senai.uc8projeto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.uc8projeto.model.Localizacao;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Integer> {
}
