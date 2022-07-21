package br.com.senai.uc8projeto.repositorio;

import br.com.senai.uc8projeto.model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer> {
}
