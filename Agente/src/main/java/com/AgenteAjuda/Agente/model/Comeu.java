package com.AgenteAjuda.Agente.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TB_COMEU")
public class Comeu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String comida1;
	
	private String comida2;
	
	private String comida3;
	
	private String comida4;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComida1() {
		return comida1;
	}

	public void setComida1(String comida1) {
		this.comida1 = comida1;
	}

	public String getComida2() {
		return comida2;
	}

	public void setComida2(String comida2) {
		this.comida2 = comida2;
	}

	public String getComida3() {
		return comida3;
	}

	public void setComida3(String comida3) {
		this.comida3 = comida3;
	}

	public String getComida4() {
		return comida4;
	}

	public void setComida4(String comida4) {
		this.comida4 = comida4;
	}
	

	
}
