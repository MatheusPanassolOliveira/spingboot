package br.com.qodeless.desafioSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.qodeless.desafioSpringBoot.model.Aluno;
import br.com.qodeless.desafioSpringBoot.service.AlunoService;

@Controller
@RequestMapping(path="/aluno") 
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping(path="/todos")
	public @ResponseBody List<Aluno> buscarAlunos(){
		return service.buscarAlunos();
		
	}

	@PostMapping
	public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno ){
		
		service.criarAluno(aluno);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
}
