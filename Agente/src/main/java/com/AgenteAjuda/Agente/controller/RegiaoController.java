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

import com.AgenteAjuda.Agente.model.Regiao;
import com.AgenteAjuda.Agente.repository.RegiaoRepository;

@RestController
@RequestMapping("/regiao")
@CrossOrigin("*")
public class RegiaoController {

	@Autowired
	private RegiaoRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Regiao>> GetALL() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Regiao> GetById(@PathVariable long id){ 
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Regiao> post (@RequestBody Regiao regiao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(regiao));
	}
	
	@PutMapping
	public ResponseEntity<Regiao> put (@RequestBody Regiao regiao){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(regiao));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
