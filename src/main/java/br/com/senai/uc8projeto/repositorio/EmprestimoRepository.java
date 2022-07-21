package br.com.senai.uc8projeto.repositorio;

import br.com.senai.uc8projeto.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
