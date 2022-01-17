package com.carvajal.crudbackend.respository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.carvajal.crudbackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	

}
