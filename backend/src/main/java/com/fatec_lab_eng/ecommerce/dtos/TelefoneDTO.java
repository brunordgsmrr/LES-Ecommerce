package com.fatec_lab_eng.ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;

public class TelefoneDTO {

	private Long id;
	
	@NotBlank
	private int ddd;
	
	@NotBlank
	private Long numero;
	
	@NotBlank
	private String tipo;

	public TelefoneDTO() {
		super();
	}

	public TelefoneDTO(Long id, int ddd, Long numero, String tipo) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
