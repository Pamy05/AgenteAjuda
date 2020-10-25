package com.AgenteAjuda.Agente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgenteAjuda.Agente.model.Comeu;
import com.AgenteAjuda.Agente.repository.ComeuRepository;

@RestController
@RequestMapping("/comeu")
@CrossOrigin("*")
public class ComeuController {
	
	@Autowired
	private ComeuRepository repository;

	@GetMapping 
	public ResponseEntity<List<Comeu>> GetALL() {
		return ResponseEntity.ok(repository.findAll());
	}
}
