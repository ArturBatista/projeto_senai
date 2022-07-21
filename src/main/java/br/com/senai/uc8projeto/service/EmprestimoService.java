package br.com.senai.uc8projeto.service;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.repositorio.EmprestimoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    EmprestimoRepository repository;

    public Emprestimo create(Emprestimo obj){
        return repository.save(obj);
    }

    public Emprestimo findById(Integer id){
        Optional<Emprestimo> obj = repository.findById(id);

        return obj.get();
    }

}
