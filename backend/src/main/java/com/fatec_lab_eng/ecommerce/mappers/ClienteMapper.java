package com.fatec_lab_eng.ecommerce.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fatec_lab_eng.ecommerce.dtos.CadastrarClienteDTO;
import com.fatec_lab_eng.ecommerce.entities.Cliente;

@Mapper(componentModel = "spring", uses = { TelefoneMapper.class, EnderecoMapper.class, CartaoCreditoMapper.class })
public interface ClienteMapper {

	@Mappings({
        @Mapping(target = "enderecosCobranca", ignore = true), // Ignorar mapeamento direto para evitar loops
        @Mapping(target = "enderecosEntrega", ignore = true),
        @Mapping(target = "cartoesCredito", ignore = true)
    })
	Cliente toEntity(CadastrarClienteDTO dto);

	CadastrarClienteDTO toDto(Cliente cliente);

}
