package com.fatec_lab_eng.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fatec_lab_eng.ecommerce.entities.Telefone;

@Repository
public interface ITelefoneRepository extends JpaRepository<Telefone, Long>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM tb_telefones WHERE cliente_id = :cliente_id;")
	List<Telefone> findByClienteId(Long cliente_id);

}
