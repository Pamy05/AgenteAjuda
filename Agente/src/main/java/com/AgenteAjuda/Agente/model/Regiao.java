package com.AgenteAjuda.Agente.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_REGIAO")
public class Regiao {
	
	
	private long id;
	
	
	@OneToMany(mappedBy = "crianca" , cascade = CascadeType.ALL)
	@JsonIgnoreProperties("crianca")
	private List<Familia>familia;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	

	
}
