package br.com.senai.uc8projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.repositorio.SolicitanteRepository;

@Service
public class SolicitanteService {

    @Autowired
    SolicitanteRepository repository;

    public Solicitante create(Solicitante obj){
        return repository.save(obj);
    }
    
    public List<Solicitante> listar(){
        return (List<Solicitante>) repository.findAll();
    }
    
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    public Solicitante carregar(Integer id){
        return (Solicitante) repository.findById(id).get();
    }
    
    public Solicitante atualizar(Solicitante solicitante) {
		return repository.save(solicitante);
	}
    
}
