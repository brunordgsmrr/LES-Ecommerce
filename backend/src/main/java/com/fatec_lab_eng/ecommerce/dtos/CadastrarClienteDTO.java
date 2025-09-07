package com.fatec_lab_eng.ecommerce.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fatec_lab_eng.ecommerce.entities.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CadastrarClienteDTO {
	
	private Long id;	
	
	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	
	@NotNull(message = "O gênero é obrigatório")
	private String genero;
	
	@NotNull(message = "A data de nascimento é obrigatória")
	private LocalDate dataNascimento;	
	
	@NotNull(message = "O CPF é obrigatório")
	private String cpf;
	
	@Email(message = "O email deve ser válido")
    @NotBlank(message = "O email é obrigatório")
	private String email;
	
	@NotBlank(message = "A senha é obrigatória")
	private String password;
	
	@NotEmpty(message = "Deve conter pelo menos um telefone")
	private List<TelefoneDTO> telefones = new ArrayList<>();	
	
	@NotNull(message = "Deve conter pelo menos um endereço de residência")
	private EnderecoDTO enderecoResidencial;
	
	public CadastrarClienteDTO(Cliente entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public CadastrarClienteDTO() {
		super();
	}

	public CadastrarClienteDTO(Long id, String nome, String genero, LocalDate dataNascimento, String cpf, String email,
			String password, List<TelefoneDTO> telefones, EnderecoDTO enderecoResidencial) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		this.telefones = telefones;
		this.enderecoResidencial = enderecoResidencial;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TelefoneDTO> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneDTO> telefones) {
		this.telefones = telefones;
	}

	public EnderecoDTO getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(EnderecoDTO enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}
	
	

}
