package com.AgenteAjuda.Agente.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_REGIAO")
public class Regiao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String ubs;
	
	
	@OneToMany(mappedBy = "crianca" , cascade = CascadeType.ALL)
	@JsonIgnoreProperties("crianca")
	private List<Familia>familia;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUbs() {
		return ubs;
	}


	public void setUbs(String ubs) {
		this.ubs = ubs;
	}


	public List<Familia> getFamilia() {
		return familia;
	}


	public void setFamilia(List<Familia> familia) {
		this.familia = familia;
	}
	

	
	
}