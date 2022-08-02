package br.com.senai.uc8projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.uc8projeto.model.Maquina;
import br.com.senai.uc8projeto.repositorio.MaquinaRepository;

@Service
public class MaquinaService {

    @Autowired
    MaquinaRepository repository;

    public Maquina create(Maquina obj){
        return repository.save(obj);
    }
    
    public List<Maquina> listar(){
        return (List<Maquina>) repository.findAll();
    }
    
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    public Maquina carregar(Integer id){
        return (Maquina) repository.findById(id).get();
    }
    
    public Maquina atualizar(Maquina maquina) {
		return repository.save(maquina);
	}
    
}
