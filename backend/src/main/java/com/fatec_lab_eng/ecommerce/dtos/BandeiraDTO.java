package com.fatec_lab_eng.ecommerce.dtos;

public class BandeiraDTO {
	
	private Long id;
	private String nome;
	
	public BandeiraDTO() {
		super();
	}
	public BandeiraDTO(Long id, String nome) {
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
