package com.lab2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "request")

public class Request extends AuditModel {

	public enum Tipo {
		ADMINISTRADOR,
		QUINIELAPRIVADA;
	}

	public enum Estado{
		ENREVISION,
		APROBADA,
		RECHAZADA;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "sport_id")
    private int id;
    
    @Column(name = "name")
	private String name;

	@Column(name = "tipo")
	private Tipo tipo;

	@Column(name = "estado")
	private Estado estado;
	
	private Request() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTipo() {
		return id;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getEstado() {
		return id;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}

