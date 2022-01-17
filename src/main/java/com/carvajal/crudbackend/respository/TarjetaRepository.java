package com.carvajal.crudbackend.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.carvajal.crudbackend.model.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long>  {


}