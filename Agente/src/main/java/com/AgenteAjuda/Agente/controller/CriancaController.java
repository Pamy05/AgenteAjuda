package com.AgenteAjuda.Agente.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgenteAjuda.Agente.model.Crianca;
import com.AgenteAjuda.Agente.repository.CriancaRepository;

@RestController
@RequestMapping("/crianca")
@CrossOrigin("*")
public class CriancaController {

	
	@Autowired
	private CriancaRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Crianca>> GetALL() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") //find/get com parametro id
	public ResponseEntity<Crianca> GetById(@PathVariable long id){ //@PathVariable o valor que entrar em Id vai vim vim como uma variavel do caminho uri
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public ResponseEntity<Crianca> post (@RequestBody Crianca crianca){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(crianca));
	}
	
	@PutMapping
	public ResponseEntity<Crianca> put (@RequestBody Crianca crianca){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(crianca));
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
