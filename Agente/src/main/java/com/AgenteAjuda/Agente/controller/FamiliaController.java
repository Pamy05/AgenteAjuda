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

import com.AgenteAjuda.Agente.model.Familia;
import com.AgenteAjuda.Agente.repository.FamiliaRepository;

@RestController
@RequestMapping("/familia")
@CrossOrigin("*")
public class FamiliaController {

	
	@Autowired
	private FamiliaRepository repository;
	
	
	@GetMapping 
	public ResponseEntity<List<Familia>> GetALL() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/{id}") 
	public ResponseEntity<Familia> GetById(@PathVariable long id){ 
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public ResponseEntity<Familia> post (@RequestBody Familia familia){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(familia));
	}
	
	@PutMapping
	public ResponseEntity<Familia> put (@RequestBody Familia familia){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(familia));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
