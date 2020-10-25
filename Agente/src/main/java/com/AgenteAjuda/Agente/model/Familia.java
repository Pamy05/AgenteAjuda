package com.AgenteAjuda.Agente.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_FAMILIA")
public class Familia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 15 , max = 15)
	private int carteira;
	
	@NotNull
	@Size(max = 20)
	private String agente;
	
	@OneToMany(mappedBy = "familia" , cascade = CascadeType.ALL)
    @JsonIgnoreProperties("familia")
	private List<Crianca> crianca;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	public List<Crianca> getCrianca() {
		return crianca;
	}

	public void setCrianca(List<Crianca> crianca) {
		this.crianca = crianca;
	}

	public String getAgente() {
		return agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}
	
	

}