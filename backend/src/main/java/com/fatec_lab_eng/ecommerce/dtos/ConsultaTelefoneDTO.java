package com.fatec_lab_eng.ecommerce.dtos;

import org.springframework.beans.BeanUtils;

import com.fatec_lab_eng.ecommerce.entities.Telefone;

public class ConsultaTelefoneDTO {

	private Long id;
	private int ddd;
	private Long numero;
	private String tipo;

	public ConsultaTelefoneDTO() {
		super();
	}
	
	public ConsultaTelefoneDTO(Telefone entity) {		
		BeanUtils.copyProperties(entity, this);
	}

	public ConsultaTelefoneDTO(Long id, int ddd, Long numero, String tipo) {
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
