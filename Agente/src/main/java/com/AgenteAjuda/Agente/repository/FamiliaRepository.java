package com.AgenteAjuda.Agente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgenteAjuda.Agente.model.Familia;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia, Long>{
	public List<Familia> findALLByCarteiraContaining (int carteira);

}
