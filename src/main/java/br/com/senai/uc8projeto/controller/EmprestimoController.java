package br.com.senai.uc8projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.uc8projeto.model.Emprestimo;
import br.com.senai.uc8projeto.service.EmprestimoService;

@CrossOrigin("*")
@Controller
public class EmprestimoController {

	@Autowired
	private EmprestimoService servico;
	
	@GetMapping(value="/emprestimo")
	public String listar(Model modelo){
		modelo.addAttribute("emprestimo", servico.listar());
		return "pages/emprestimo/listar";
	}
	
	@GetMapping(value="/emprestimo/cadastrar")
	public String cadastrar(Model modelo) {
		Emprestimo emprestimo = new Emprestimo();
		modelo.addAttribute("emprestimo", emprestimo);
		return "pages/emprestimo/cadastro";
	}
	
	@PostMapping(value="/emprestimo")
	public String salvar(@ModelAttribute("emprestimo") Emprestimo emprestimo) {
		servico.create(emprestimo);
		return "redirect:/emprestimo";
	}
	
	@GetMapping(value = "/emprestimo/delete/{id}")
	public String deletar(@PathVariable Integer id) {
		servico.delete(id);
		return "redirect:/emprestimo";
	}
	
	@GetMapping(value = "/emprestimo/editar/{id}")
	public String editar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("emprestimo", servico.carregar(id));
		return "pages/emprestimo/editar";
	}
	
	@PostMapping("/emprestimo/{id}")
	public String atualizar(@PathVariable Integer id, @ModelAttribute("categoria") Emprestimo emprestimo, Model modelo) {
		Emprestimo obj = servico.carregar(id);
		obj.setId(id);
		obj.setDataEmprestimo(emprestimo.getDataEmprestimo());
		obj.setDataDevolucao(emprestimo.getDataDevolucao());
		obj.setHorasAFazer(emprestimo.getHorasAFazer());
		obj.setMaquina(emprestimo.getMaquina());
		obj.setSolicitante(emprestimo.getSolicitante());
		obj.setLocalizacao(emprestimo.getLocalizacao());
		obj.setUsuario(emprestimo.getUsuario());
		servico.atualizar(obj);
		return "redirect:/emprestimo";
	}
	
}
