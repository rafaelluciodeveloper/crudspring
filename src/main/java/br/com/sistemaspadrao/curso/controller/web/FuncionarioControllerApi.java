package br.com.sistemaspadrao.curso.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemaspadrao.curso.model.Funcionario;
import br.com.sistemaspadrao.curso.service.FuncionarioService;

@RestController
@RequestMapping(path = "/funcionario/api")
public class FuncionarioControllerApi {

	@Autowired
	FuncionarioService service;
		
	@GetMapping(path ="/lista")
	public List<Funcionario> index() {
		return service.listarTodosFuncionarios();
	} 
}
