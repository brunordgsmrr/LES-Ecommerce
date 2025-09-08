package com.fatec_lab_eng.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec_lab_eng.ecommerce.dtos.CadastrarClienteDTO;
import com.fatec_lab_eng.ecommerce.dtos.ConfirmacaoCadastroDTO;
import com.fatec_lab_eng.ecommerce.dtos.ConsultaClienteDTO;
import com.fatec_lab_eng.ecommerce.dtos.ConsultaTelefoneDTO;
import com.fatec_lab_eng.ecommerce.entities.Cliente;
import com.fatec_lab_eng.ecommerce.entities.Telefone;
import com.fatec_lab_eng.ecommerce.mappers.ClienteMapper;
import com.fatec_lab_eng.ecommerce.repositories.IClienteRepository;
import com.fatec_lab_eng.ecommerce.repositories.ITelefoneRepository;

@Service
public class ClienteService {

	@Autowired
	public IClienteRepository clienteRepository;
	
	@Autowired
	public ITelefoneRepository telefoneRepository;
	
	@Autowired
    private ClienteMapper clienteMapper;

	public ConfirmacaoCadastroDTO cadastrarCliente(CadastrarClienteDTO clienteDTO){
		
		Cliente cliente = clienteMapper.toEntity(clienteDTO);
		ConfirmacaoCadastroDTO confirmacao = new ConfirmacaoCadastroDTO();
		
		cliente.getTelefones().forEach(telefone -> telefone.setCliente(cliente));
		
		cliente.getEnderecoResidencial().setCliente(cliente);	
		
		clienteDTO.setId(clienteRepository.save(cliente).getId());
		
		if (clienteDTO.getId() == null) {
			confirmacao.setMessage("Falha");
			confirmacao.setSuccess(false);
		} else {
			confirmacao.setMessage("Sucesso");
			confirmacao.setSuccess(true);
		}

		return confirmacao;
	}

	public List<ConsultaClienteDTO> consultarTodosClientes() {
		
		List<Cliente> result = clienteRepository.findAll();
		List<ConsultaClienteDTO> todosClientes = new ArrayList<ConsultaClienteDTO>();
		
		for(Cliente cliente: result) {
			List<Telefone> resultTelefones = telefoneRepository.findByClienteId(cliente.getId());
			
			List<ConsultaTelefoneDTO> telefones = resultTelefones.stream().map(y -> new ConsultaTelefoneDTO(y)).toList();			
			
			ConsultaClienteDTO consultaClienteDTO = new ConsultaClienteDTO(cliente);
			
			consultaClienteDTO.setTelefones(telefones);
			
			todosClientes.add(consultaClienteDTO);
		}
		
		return todosClientes;
	}

}
