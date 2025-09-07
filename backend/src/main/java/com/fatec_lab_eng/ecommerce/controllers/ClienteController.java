package com.fatec_lab_eng.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec_lab_eng.ecommerce.dtos.CadastrarClienteDTO;
import com.fatec_lab_eng.ecommerce.dtos.EnderecoDTO;
import com.fatec_lab_eng.ecommerce.dtos.TelefoneDTO;
import com.fatec_lab_eng.ecommerce.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/cliente")
	public String getCliente() {
		return "Primeiro endpoint";
	}

	@PostMapping("/cliente")
	public ResponseEntity<String> cadastrarCliente(@Valid @RequestBody CadastrarClienteDTO body) {

		List<TelefoneDTO> telefones = body.getTelefones();
		EnderecoDTO endereco = body.getEnderecoResidencial();

		for (TelefoneDTO telefone : telefones) {
			if (telefone.getNumero() == null || telefone.getDdd() == 0 || telefone.getTipo() == null) {
				return ResponseEntity.badRequest().body("Dados de telefone incorretos");
			}
		}

		if (endereco.getTipoEndereco() == null || endereco.getTipoLogradouro() == null || endereco.getTipoResidencia() == null
				|| endereco.getLogradouro() == null || endereco.getNumero() == null || endereco.getBairro() == null
				|| endereco.getCep() == null || endereco.getCidade() == null || endereco.getEstado() == null
				|| endereco.getPais() == null) {
			return ResponseEntity.badRequest().body("Dados de endereço incorretos");
		}
		
		clienteService.cadastrarCliente(body);

		return ResponseEntity.ok("Cadastro realizado com sucesso");
	}
	
	

}
