package com.carvajal.crudbackend.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		
		@GetMapping
		private ResponseEntity<List<Tarjeta>> getAllTarjeta (){
			return ResponseEntity.ok(tarjetaService.findAll());
		}
			@GetMapping ("{numero}")
		private ResponseEntity<List<Tarjeta>> getAllTarjetaByCliente (@PathVariable("numero") Long cliente){
			return ResponseEntity.ok(tarjetaService.findAllByCliente(cliente));
			
		}
		
	@PostMapping
	private ResponseEntity<Tarjeta> saveTarjeta(@RequestBody Tarjeta tarjeta){
		try {
			Tarjeta tarjetaGuardada=tarjetaService.save(tarjeta);
			return ResponseEntity.created(new URI("/tarjeta/"+tarjetaGuardada.getNumero())).body(tarjetaGuardada);
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
	}
		
		

	}
	

