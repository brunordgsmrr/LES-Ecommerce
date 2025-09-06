package com.fatec_lab_eng.ecommerce.entities;

public class CartaoCredito {
	
	private Long id;
	private String numero;
	private String cvv;
	private Bandeira bandeira;
	
	public CartaoCredito() {
		super();
	}

	public CartaoCredito(Long id, String numero, String cvv, Bandeira bandeira) {
		super();
		this.id = id;
		this.numero = numero;
		this.cvv = cvv;
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

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	
	
	
	

}
