package com.fatec_lab_eng.ecommerce.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fatec_lab_eng.ecommerce.dtos.CartaoCreditoDTO;
import com.fatec_lab_eng.ecommerce.entities.CartaoCredito;

@Mapper(componentModel = "spring")
public interface CartaoCreditoMapper {
	
	CartaoCredito toEntity(CartaoCreditoDTO dto);
	
	@Mappings({
		@Mapping(target = "cliente", ignore = true)
    })
	CartaoCreditoDTO toDto(CartaoCredito entity);

}
