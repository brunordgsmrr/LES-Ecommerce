package com.fatec_lab_eng.ecommerce.mappers;

import org.mapstruct.Mapper;

import com.fatec_lab_eng.ecommerce.dtos.TelefoneDTO;
import com.fatec_lab_eng.ecommerce.entities.Telefone;

@Mapper(componentModel = "spring")
public interface TelefoneMapper {

	TelefoneDTO toDto(Telefone telefone);

	Telefone toEntity(TelefoneDTO dto);

}
