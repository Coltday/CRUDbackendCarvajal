package com.carvajal.crudbackend.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carvajal.crudbackend.model.Cliente;
import com.carvajal.crudbackend.model.Tarjeta;
import com.carvajal.crudbackend.service.ClienteService;
@RestController
@RequestMapping ("/cliente/")
public class ClienteREST {
	@Autowired
	private ClienteService clienteService;
	
	//Lista todos
	@GetMapping
	private ResponseEntity<List<Cliente>> getAllCliente (){
		return ResponseEntity.ok(clienteService.findAll());
		
	}
	
	//Busca por id
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Cliente>> getById (@PathVariable("id") Long id){
		return ResponseEntity.ok(clienteService.findById(id));}
	

	
	
	//Guarda
	@PostMapping
	private ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
		try {
			Cliente clienteGuardada=clienteService.save(cliente);
			return ResponseEntity.created(new URI("/cliente/"+clienteGuardada.getId())).body(clienteGuardada);
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
	}
	
	
	//Elimina
	@DeleteMapping ("{id}")
	private ResponseEntity<Optional<Cliente>> delete(@PathVariable Long id){
		try {
		clienteService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}}

//Edita

	
