package com.AgenteAjuda.Agente.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_CRIANCA")
public class Crianca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 15 , max = 15)
	private int carteira;
	
	@NotNull
	@Size(min = 3 , max = 50 )
	private String nome;
	
	@NotNull
	@Size(max = 2)
	private int idade;
	
	@NotNull
	@Size(max = 7)
	private float renda;
	
	@NotNull
	@Size(min = 4 , max = 4)
	private float altura;
	
	@NotNull
	@Size(min = 2 , max = 5)
	private float peso;
	
	@Size(max = 100)
	private String doencas;
	
	@Size(max = 100)
	private String remedios;
	
	@ManyToOne
	@JsonIgnoreProperties("crianca")
	private Crianca crianca;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getDoencas() {
		return doencas;
	}

	public void setDoencas(String doencas) {
		this.doencas = doencas;
	}

	public String getRemedios() {
		return remedios;
	}

	public void setRemedios(String remedios) {
		this.remedios = remedios;
	}

	public Crianca getCrianca() {
		return crianca;
	}

	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	
	
	
}


