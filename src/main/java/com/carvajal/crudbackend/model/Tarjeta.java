package com.carvajal.crudbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Random;


@Entity
@Table (name = "tarjeta")
public class Tarjeta {
	
	@Id
	private Long numero;
	@ManyToOne
	@JoinColumn (name="id_cliente")
	private Cliente cliente;
	private int ahno;
	private int mes;
	private int codigo;
	
	public Tarjeta() {
		
	}
	
	
	public Tarjeta(Cliente cliente, Long numero, int ahno, int mes, int codigo) {
		super();
		this.cliente = cliente;
		this.numero = numero;
		this.ahno = ahno;
		this.mes = mes;
		this.codigo = codigo;
	}


  
	

		public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Long getNumero() {
		return numero;
	}



	public void setNumero(Long numero) {
		this.numero = numero;
	}



	public int getAhno() {
		return ahno;
	}



	public void setAhno(int ahno) {
		this.ahno = ahno;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	
	
	
	
	

}
