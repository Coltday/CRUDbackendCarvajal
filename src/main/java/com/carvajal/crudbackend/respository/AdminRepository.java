package com.carvajal.crudbackend.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carvajal.crudbackend.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
