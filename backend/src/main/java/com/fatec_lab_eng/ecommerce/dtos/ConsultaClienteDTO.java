package com.fatec_lab_eng.ecommerce.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fatec_lab_eng.ecommerce.entities.Cliente;

public class ConsultaClienteDTO {
	
	private Long id;
	private String nome;
	private String genero;
	private LocalDate dataNascimento;
	private String cpf;
	private String email;
	private List<ConsultaTelefoneDTO> telefones = new ArrayList<>();
	private EnderecoDTO enderecoResidencial;
	
	public ConsultaClienteDTO(Cliente entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public ConsultaClienteDTO() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ConsultaTelefoneDTO> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<ConsultaTelefoneDTO> telefones) {
		this.telefones = telefones;
	}

	public EnderecoDTO getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(EnderecoDTO enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}
	
	

}
