package com.AgenteAjuda.Agente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgenteAjuda.Agente.model.Comeu;

@Repository
public interface ComeuRepository extends JpaRepository<Comeu, Long>{
	public List<Comeu> findALLByComida1ContainingIgnoreCase (String comida1);

}

