package com.carvajal.crudbackend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "cliente")
public class Cliente {

	@Id
	@Column (name = "documento")
	private Long id;
	private String nombre;
	private String contraseña;
//	@OneToMany (mappedBy = "cliente")
//	private List<Tarjeta> listaTarjeta;
	
	public Cliente() {
		
	}
//	List<Tarjeta> listaTarjeta
	public Cliente(Long id, String nombre, String contraseña) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
//		this.listaTarjeta = listaTarjeta;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getContraseña() {
		return contraseña;
	}




	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}




//	public List<Tarjeta> getListaTarjeta() {
//		return listaTarjeta;
//	}
//
//
//
//
//	public void setListaTarjeta(List<Tarjeta> listaTarjeta) {
//		this.listaTarjeta = listaTarjeta;
//	}
	
	
	
	
	
	
	
	
	
}
