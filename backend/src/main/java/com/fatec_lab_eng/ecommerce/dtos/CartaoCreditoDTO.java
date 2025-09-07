package com.fatec_lab_eng.ecommerce.dtos;

import com.fatec_lab_eng.ecommerce.entities.Bandeira;
import com.fatec_lab_eng.ecommerce.entities.Cliente;

public class CartaoCreditoDTO {

	private Long id;
	private String numero;
	private String cvv;
	private Cliente cliente;
	private Bandeira bandeira;
	
	public CartaoCreditoDTO() {
		super();
	}
	public CartaoCreditoDTO(Long id, String numero, String cvv, Cliente cliente, Bandeira bandeira) {
		super();
		this.id = id;
		this.numero = numero;
		this.cvv = cvv;
		this.cliente = cliente;
		this.bandeira = bandeira;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	
	
	
}
