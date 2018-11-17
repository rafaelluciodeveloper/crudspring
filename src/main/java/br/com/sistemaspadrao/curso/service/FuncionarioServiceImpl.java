package br.com.sistemaspadrao.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemaspadrao.curso.model.Funcionario;
import br.com.sistemaspadrao.curso.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	FuncionarioRepository repository ;

	@Override
	public List<Funcionario> listarTodosFuncionarios() {
		return repository.findAll();
	}

	@Override
	public void salvar(Funcionario funcionario) {
			repository.save(funcionario);		
	}

	@Override
	public void excluir(Funcionario funcionario) {
		repository.delete(funcionario);
	}

	@Override
	public Funcionario buscar(Long id) {
		return repository.findById(id).get();
	}

	

}
