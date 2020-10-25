package com.AgenteAjuda.Agente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgenteAjuda.Agente.model.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long>{
	public List<Regiao> findALLByUbsContainingIgnoreCase (String ubs);

}
