package com.fatec_lab_eng.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

public class Cliente {
	
	private Long id;
	private String nome;
	private String genero;
	private LocalDate dataNascimento;
	private String cpf;
	private Telefone telefone;
	private String email;
	private String password;
	private Endereco enderecoResidencial;
	private List<Endereco> enderecosCobranca;
	private List<Endereco> enderecosEntrega;
	private List<CartaoCredito> cartoesCredito;
	
	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, String genero, LocalDate dataNascimento, String cpf, Telefone telefone,
			String email, String password, Endereco enderecoResidencial, List<Endereco> enderecosCobranca,
			List<Endereco> enderecosEntrega, List<CartaoCredito> cartoesCredito) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.password = password;
		this.enderecoResidencial = enderecoResidencial;
		this.enderecosCobranca = enderecosCobranca;
		this.enderecosEntrega = enderecosEntrega;
		this.cartoesCredito = cartoesCredito;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Endereco getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(Endereco enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

	public List<Endereco> getEnderecosCobranca() {
		return enderecosCobranca;
	}

	public void setEnderecosCobranca(List<Endereco> enderecosCobranca) {
		this.enderecosCobranca = enderecosCobranca;
	}

	public List<Endereco> getEnderecosEntrega() {
		return enderecosEntrega;
	}

	public void setEnderecosEntrega(List<Endereco> enderecosEntrega) {
		this.enderecosEntrega = enderecosEntrega;
	}

	public List<CartaoCredito> getCartoesCredito() {
		return cartoesCredito;
	}

	public void setCartoesCredito(List<CartaoCredito> cartoesCredito) {
		this.cartoesCredito = cartoesCredito;
	}
	
	
	
	

}
