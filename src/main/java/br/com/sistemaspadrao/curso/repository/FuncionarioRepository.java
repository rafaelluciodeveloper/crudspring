package br.com.sistemaspadrao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaspadrao.curso.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{
	

}
