package br.com.senai.uc8projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.uc8projeto.model.Localizacao;
import br.com.senai.uc8projeto.service.LocalizacaoService;

@CrossOrigin("*")
@Controller
public class LocalizacaoController {

	@Autowired
	private LocalizacaoService servico;
	
	@GetMapping(value="/localizacao")
	public String listar(Model modelo){
		modelo.addAttribute("localizacao", servico.listar());
		return "pages/localizacao/listar"; //mostrar a página grupo.html
	}
	
	@GetMapping(value="/localizacao/cadastrar")
	public String cadastrar(Model modelo) {
		Localizacao localizacao = new Localizacao();
		modelo.addAttribute("localizacao", localizacao);
		return "pages/localizacao/cadastro";
	}
	
	@PostMapping(value="/localizacao")
	public String salvar(@ModelAttribute("localizacao") Localizacao localizacao) {
		servico.create(localizacao);
		return "redirect:/localizacao";
	}
	
	@GetMapping(value = "/localizacao/delete/{id}")
	public String deletar(@PathVariable Integer id) {
		servico.delete(id);
		return "redirect:/localizacao";
	}
	
	@GetMapping(value = "/localizacao/editar/{id}")
	public String editar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("localizacao", servico.carregar(id));
		return "pages/localizacao/editar";
	}
	
	@PostMapping("/localizacao/{id}")
	public String atualizar(@PathVariable Integer id, @ModelAttribute("categoria") Localizacao localizacao, Model modelo) {
		Localizacao obj = servico.carregar(id);
		obj.setId(id);
		obj.setLocal(localizacao.getLocal());
		
		servico.atualizar(obj);
		return "redirect:/localizacao";
	}
	
}
