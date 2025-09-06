package com.fatec_lab_eng.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec_lab_eng.ecommerce.entities.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
