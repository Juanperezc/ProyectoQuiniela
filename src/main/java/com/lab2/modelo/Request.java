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

	public enum Type {
		ADMINISTRADOR,
		QUINIELAPRIVADA;
	}

	public enum State{
		SINREVISION,
		VISTA,
		APROBADA,
		RECHAZADA;
	}
	private static final long serialVersionUID = 1L;


    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "from_id")
	private User from_id;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_id")
	private User to_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "request_id")
    private int id;
    
	@Column(name = "type")
	private Type type;

	@Column(name = "state")
	private State state;
	
	private Request() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setTipo(Type type) {
		this.type = type;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void setToID(User to_id){
		this.to_id = to_id;
	}
	public void setFromID(User from_id){
		this.from_id = from_id;
	}
	public User getFromID(){
		return from_id;
	}
	public User getToID(){
		return to_id;
	}
}

