package com.fatec_lab_eng.ecommerce.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fatec_lab_eng.ecommerce.dtos.EnderecoDTO;
import com.fatec_lab_eng.ecommerce.entities.Endereco;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
	
	@Mappings({
		@Mapping(target = "cliente", ignore = true)
    })
	Endereco toEntity(EnderecoDTO dto);
	Endereco toDto(Endereco entity);

}
