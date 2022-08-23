package br.com.senai.uc8projeto.service;

import br.com.senai.uc8projeto.model.Maquina;
import br.com.senai.uc8projeto.repositorio.MaquinaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class MaquinaService {

    @Autowired
    MaquinaRepository repository;

    public Maquina create(Maquina obj){
        return repository.save(obj);
    }
    
    public List<Maquina> listar(){
    	List<Maquina> mk = (List<Maquina>) repository.findAll();
    	List<Maquina> toReturn = (List<Maquina>) repository.findByDescricao("");
    	mk.forEach(each -> {
    		if (each.getDescricao().toString().contains("_2")) toReturn.add(each);
    	});
    	/*
    	for (Maquina each : mk) {
    		if (each.getDescricao().toString().contains("_2")) toReturn.add(each);
    	}
    	*/
        //return (List<Maquina>) repository.findByDescricao("MACHINE_1");
    	return toReturn;
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
