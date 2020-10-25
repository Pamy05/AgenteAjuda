package com.AgenteAjuda.Agente.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgenteAjuda.Agente.model.Crianca;

@Repository
public interface CriancaRepository extends JpaRepository<Crianca, Long>{
	public List<Crianca> findALLByNomeContainingIgnoreCase (String nome);

}
