package br.com.senai.uc8projeto.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.senai.uc8projeto.model.Solicitante;
import br.com.senai.uc8projeto.service.SolicitanteService;

@CrossOrigin("*")
@Controller
public class SolicitanteController {

	@Autowired
	private SolicitanteService servico;
	
	@GetMapping(value="/solicitante")
	public String listar(Model modelo){
		modelo.addAttribute("solicitante", servico.listar());
		return "pages/solicitante/listar"; //mostrar a página grupo.html
	}
	
	@GetMapping(value="/solicitante/cadastrar")
	public String cadastrar(Model modelo) {
		Solicitante solicitante = new Solicitante();
		modelo.addAttribute("solicitante", solicitante);
		return "pages/solicitante/cadastro";
	}
	
	@PostMapping(value="/solicitante")
	public String salvar(@ModelAttribute("solicitante") Solicitante solicitante) {
		servico.create(solicitante);
		return "redirect:/solicitante";
	}
	
	@GetMapping(value = "/solicitante/delete/{id}")
	public String deletar(@PathVariable Integer id) {
		servico.delete(id);
		return "redirect:/solicitante";
	}
	
	@GetMapping(value = "/solicitante/editar/{id}")
	public String editar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("solicitante", servico.carregar(id));
		return "pages/solicitante/editar";
	}
	
	@PostMapping("/solicitante/{id}")
	public String atualizar(@PathVariable Integer id, @ModelAttribute("categoria") Solicitante solicitante, Model modelo) {
		Solicitante obj = servico.carregar(id);
		obj.setId(id);
		obj.setNome(solicitante.getNome());
		obj.setTelefone(solicitante.getTelefone());
		servico.atualizar(obj);
		return "redirect:/solicitante";
	}
	
}
