package com.carvajal.crudbackend.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carvajal.crudbackend.model.Cliente;
import com.carvajal.crudbackend.model.Tarjeta;
import com.carvajal.crudbackend.service.TarjetaService;


	@CrossOrigin(origins= {"http://localhost:8080"})
	@RestController
	@RequestMapping ("/tarjeta/")
	public class TarjetaREST {
		
		@Autowired
		private TarjetaService tarjetaService;
		
		//lista las tarjetas
		@GetMapping
		private ResponseEntity<List<Tarjeta>> getAllTarjeta(){
			return ResponseEntity.ok(tarjetaService.findAll());
		}
//		Trae las tarjetas de los clientes
			@GetMapping ("cliente/{numero}")
		private ResponseEntity<List<Tarjeta>> getAllTarjetaByCliente (@PathVariable("numero") Long cliente){
			return ResponseEntity.ok(tarjetaService.findAllByCliente(cliente));
			}
			//Encuentra la tarjeta por numero
			@GetMapping ("numero/{numero}")
			private ResponseEntity<Optional<Tarjeta>> getById(@PathVariable Long numero){
				return ResponseEntity.ok(tarjetaService.findById(numero));}
		
			//Guarda las tarjetas
		@PostMapping
		private ResponseEntity<Tarjeta> saveTarjeta(@RequestBody Tarjeta tarjeta){
		try {
			Tarjeta tarjetaGuardada=tarjetaService.save(new Tarjeta(tarjeta.getCliente(),tarjeta.getNumero(),tarjeta.getAhno(),tarjeta.getMes(),tarjeta.getCodigo()));
			return new ResponseEntity<>(tarjetaGuardada, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
		//Borra las tarjetas
	@DeleteMapping ("numero/{numero}")
	private ResponseEntity<Optional<Tarjeta>> delete(@PathVariable Long numero){
		try {
		tarjetaService.deleteById(numero);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}}
	
	//Edita
	@PutMapping ("numero/{numero}")
	public Tarjeta update(@RequestBody Tarjeta tarjet, @PathVariable Long numero) {
		Tarjeta tarjetaUpdate=Tarje
	}
	

