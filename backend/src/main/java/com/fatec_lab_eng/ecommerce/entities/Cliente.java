package com.fatec_lab_eng.ecommerce.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String genero;
	
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(unique = true, nullable = false)
	private String cpf;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(name="url_img")
	private String urlImg;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@Column(unique = true)
	private List<Telefone> telefones = new ArrayList<>();	
	
	@OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private Endereco enderecoResidencial;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Endereco> enderecosCobranca;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Endereco> enderecosEntrega;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartaoCredito> cartoesCredito;
	
	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, String genero, LocalDate dataNascimento, String cpf, List<Telefone> telefones,
			String email, String password, Endereco enderecoResidencial, List<Endereco> enderecosCobranca,
			List<Endereco> enderecosEntrega, List<CartaoCredito> cartoesCredito, String urlImg) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefones = telefones;
		this.email = email;
		this.password = password;
		this.enderecoResidencial = enderecoResidencial;
		this.enderecosCobranca = enderecosCobranca;
		this.enderecosEntrega = enderecosEntrega;
		this.cartoesCredito = cartoesCredito;
		this.urlImg = urlImg;
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public void addTelefone(Telefone telefone) {
		this.telefones.add(telefone);
		telefone.setCliente(this);
	}
	
	public void removeTelefone(Telefone telefone) {
		this.telefones.remove(telefone);
		telefone.setCliente(null);
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
	
	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

}
