package br.com.senai.uc8projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.uc8projeto.model.Maquina;
import br.com.senai.uc8projeto.service.MaquinaService;

@CrossOrigin("*")
@Controller
public class MaquinaController {

	@Autowired
	private MaquinaService servico;
	
	@GetMapping(value="/maquina")
	public String listar(Model modelo){
		modelo.addAttribute("maquina", servico.listar());
		return "pages/maquina/listar"; //mostrar a página grupo.html
	}
	
	@GetMapping(value="/maquina/cadastrar")
	public String cadastrar(Model modelo) {
		Maquina maquina = new Maquina();
		modelo.addAttribute("maquina", maquina);
		return "pages/maquina/cadastro";
	}
	
	@PostMapping(value="/maquina")
	public String salvar(@ModelAttribute("maquina") Maquina maquina) {
		servico.create(maquina);
		return "redirect:/maquina";
	}
	
	@GetMapping(value = "/maquina/delete/{id}")
	public String deletar(@PathVariable Integer id) {
		servico.delete(id);
		return "redirect:/maquina";
	}
	
	@GetMapping(value = "/maquina/editar/{id}")
	public String editar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("maquina", servico.carregar(id));
		return "pages/maquina/editar";
	}
	
	@PostMapping("/maquina/{id}")
	public String atualizar(@PathVariable Integer id, @ModelAttribute("maquina") Maquina maquina, Model modelo) {
		Maquina obj = servico.carregar(id);
		obj.setId(id);
		obj.setDescricao(maquina.getDescricao());
		obj.setObservacao(maquina.getObservacao());
		servico.atualizar(obj);
		return "redirect:/maquina";
	}
	
}
