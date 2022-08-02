package br.com.senai.uc8projeto.service;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.repositorio.EmprestimoRepository;
import br.com.senai.uc8projeto.repositorio.EmprestimoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    EmprestimoRepository repository;

    public Emprestimo create(Emprestimo obj){
        return repository.save(obj);
    }
    
    public List<Emprestimo> listar(){
        return (List<Emprestimo>) repository.findAll();
    }
    
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    public Emprestimo carregar(Integer id){
        return (Emprestimo) repository.findById(id).get();
    }
    
    public Emprestimo atualizar(Emprestimo Emprestimo) {
		return repository.save(Emprestimo);
	}
    
}
