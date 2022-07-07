package br.com.qodeless.desafioSpringBoot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.qodeless.desafioSpringBoot.model.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

	public List<Aluno> findAll();
}
