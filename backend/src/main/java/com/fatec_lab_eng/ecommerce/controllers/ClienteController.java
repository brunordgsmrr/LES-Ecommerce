package com.fatec_lab_eng.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec_lab_eng.ecommerce.dtos.CadastrarClienteDTO;
import com.fatec_lab_eng.ecommerce.dtos.ConfirmacaoCadastroDTO;
import com.fatec_lab_eng.ecommerce.dtos.ConsultaClienteDTO;
import com.fatec_lab_eng.ecommerce.dtos.EnderecoDTO;
import com.fatec_lab_eng.ecommerce.dtos.TelefoneDTO;
import com.fatec_lab_eng.ecommerce.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;	

	@PostMapping("/cliente")
	public ConfirmacaoCadastroDTO cadastrarCliente(@Valid @RequestBody CadastrarClienteDTO body) {

		List<TelefoneDTO> telefones = body.getTelefones();
		EnderecoDTO endereco = body.getEnderecoResidencial();
		ConfirmacaoCadastroDTO confirmacaoCadastroDTO = new ConfirmacaoCadastroDTO();

		for (TelefoneDTO telefone : telefones) {
			if (telefone.getNumero() == null || telefone.getDdd() == 0 || telefone.getTipo() == null) {
				confirmacaoCadastroDTO.setMessage("Dados de telefone incorretos");
				confirmacaoCadastroDTO.setSuccess(false);
				return confirmacaoCadastroDTO;
			}
		}

		if (endereco.getTipoEndereco() == null || endereco.getTipoLogradouro() == null || endereco.getTipoResidencia() == null
				|| endereco.getLogradouro() == null || endereco.getNumero() == null || endereco.getBairro() == null
				|| endereco.getCep() == null || endereco.getCidade() == null || endereco.getEstado() == null
				|| endereco.getPais() == null) {
			confirmacaoCadastroDTO.setMessage("Dados de endereço incorretos");
			confirmacaoCadastroDTO.setSuccess(false);
			return confirmacaoCadastroDTO;
		}
		
		confirmacaoCadastroDTO = clienteService.cadastrarCliente(body);
		
		return confirmacaoCadastroDTO;
	}
	
	@GetMapping("/admin/todos-clientes")
	public List<ConsultaClienteDTO> consultarTodosClientes(){
		// TODO Consulta de todos
		
		List<ConsultaClienteDTO> todosClientes;
		
		todosClientes = clienteService.consultarTodosClientes();
		
		return todosClientes;
	}
	
	@GetMapping("/cliente")
	public String getCliente() {
		// TODO Consulta de cliente por ID
		return "Primeiro endpoint";
	}

	// TODO Busca de cliente por filtro
	
	
	
	// TODO Alterar dados do cliente
	
	// TODO Alterar apenas a senha
	
	// TODO Alterar apenas o endereço
	
	// TODO Alterar status de ativação
	
	
	

}
