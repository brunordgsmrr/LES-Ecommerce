package com.fatec_lab_eng.ecommerce.entities;

public class Bandeira {
	
	private Long id;
	private String nome;
	
	public Bandeira() {
		super();
	}

	public Bandeira(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
