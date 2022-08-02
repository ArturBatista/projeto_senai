package br.com.senai.uc8projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.model.Usuario;
import br.com.senai.uc8projeto.repositorio.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario create(Usuario obj){
        return repository.save(obj);
    }
    
    public List<Usuario> listar(){
        return (List<Usuario>) repository.findAll();
    }
    
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    public Usuario carregar(Integer id){
        return (Usuario) repository.findById(id).get();
    }
    
    public Usuario atualizar(Usuario usuario) {
		return repository.save(usuario);
	}
    
}
