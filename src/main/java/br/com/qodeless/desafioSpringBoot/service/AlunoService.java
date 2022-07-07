package br.com.qodeless.desafioSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qodeless.desafioSpringBoot.model.Aluno;
import br.com.qodeless.desafioSpringBoot.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> buscarAlunos(){
		return repository.findAll();
		
	}
	
	public Aluno criarAluno(Aluno aluno){
		
		return repository.save(aluno);
		
	}
	
}
