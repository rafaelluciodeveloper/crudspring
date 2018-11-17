package br.com.sistemaspadrao.curso.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sistemaspadrao.curso.model.Funcionario;
import br.com.sistemaspadrao.curso.service.FuncionarioService;
import br.com.sistemaspadrao.curso.service.FuncionarioServiceImpl;

@Controller
@RequestMapping(path="/funcionario")
public class FuncionarioController {
	
	@Autowired
	FuncionarioService service;
		
	@GetMapping(path ="/lista")
	public String index(ModelMap model) {
		model.addAttribute("funcionarios",service.listarTodosFuncionarios());
		return "/index";
	} 
	
	@GetMapping(path ="/cadastro")
	public String index(Funcionario funcionario) {
		return "/funcionario/cadastro";
	} 
	
	
	@PostMapping(path="/salvar")
	public String salvar(Funcionario funcionario) {
		service.salvar(funcionario);
		return "redirect:/funcionario/lista";
	}
	
	
	@GetMapping(path = "/editar/{id}")
	public String preEditar(@PathVariable("id") Long id,ModelMap model) {
		model.addAttribute("funcionario", service.buscar(id));
		return "/funcionario/cadastro";
	}
	
	@PostMapping(path="/editar")
	public String editar(Funcionario funcionario) {
		service.salvar(funcionario);
		return "redirect:/funcionario/cadastro";
	}
	
	@GetMapping(path="/excluir/{id}")
	public String excluir(@PathVariable("id") Long id,ModelMap model) {
		service.excluir(service.buscar(id));
		return "redirect:/funcionario/lista";
	}
	
}
