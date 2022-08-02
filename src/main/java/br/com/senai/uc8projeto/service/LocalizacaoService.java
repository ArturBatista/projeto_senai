package br.com.senai.uc8projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.uc8projeto.model.Localizacao;
import br.com.senai.uc8projeto.repositorio.LocalizacaoRepository;

@Service
public class LocalizacaoService {

    @Autowired
    LocalizacaoRepository repository;

    public Localizacao create(Localizacao obj){
        return repository.save(obj);
    }
    
    public List<Localizacao> listar(){
        return (List<Localizacao>) repository.findAll();
    }
    
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    public Localizacao carregar(Integer id){
        return (Localizacao) repository.findById(id).get();
    }
    
    public Localizacao atualizar(Localizacao localizacao) {
		return repository.save(localizacao);
	}
    
}
