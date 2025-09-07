package com.fatec_lab_eng.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec_lab_eng.ecommerce.entities.Telefone;

@Repository
public interface ITelefoneRepository extends JpaRepository<Telefone, Long>{

}
