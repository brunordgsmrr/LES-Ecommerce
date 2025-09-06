package com.fatec_lab_eng.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec_lab_eng.ecommerce.entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
