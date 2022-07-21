package br.com.senai.uc8projeto.service;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.repositorio.EmprestimoRepository;
import br.com.senai.uc8projeto.repositorio.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitanteService {

    @Autowired
    SolicitanteRepository repository;

    public Solicitante create(Solicitante obj){
        return repository.save(obj);
    }
}
