package br.com.sistemaspadrao.curso.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sistemaspadrao.curso.model.Funcionario;

@Service
public interface FuncionarioService {
	List<Funcionario>  listarTodosFuncionarios();
	void salvar(Funcionario funcionario);
	void excluir (Funcionario funcionario);
	Funcionario buscar(Long id);
}
