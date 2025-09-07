package com.fatec_lab_eng.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec_lab_eng.ecommerce.dtos.CadastrarClienteDTO;
import com.fatec_lab_eng.ecommerce.entities.Cliente;
import com.fatec_lab_eng.ecommerce.mappers.ClienteMapper;
import com.fatec_lab_eng.ecommerce.repositories.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	public IClienteRepository clienteRepository;
	
	@Autowired
    private ClienteMapper clienteMapper;

	public CadastrarClienteDTO cadastrarCliente(CadastrarClienteDTO clienteDTO){
		
		Cliente cliente = clienteMapper.toEntity(clienteDTO);
		
		cliente.getTelefones().forEach(telefone -> telefone.setCliente(cliente));
		
		cliente.getEnderecoResidencial().setCliente(cliente);		
		
		clienteDTO.setId(clienteRepository.save(cliente).getId());

		return clienteDTO;

	}

}
