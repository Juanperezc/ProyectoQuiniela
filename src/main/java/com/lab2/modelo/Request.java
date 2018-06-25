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

	/*public enum Type {
		ADMINISTRADOR,
		QUINIELAPRIVADA;
	}

	public enum State{
		SINREVISION,
		VISTA,
		APROBADA,
		RECHAZADA;
	}*/
	private static final long serialVersionUID = 1L;


    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fromid")
	private User fromid;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "toid")
	private User toid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "request_id")
    private int id;
    
	@Column(name = "type")
	private Integer type;

	@Column(name = "state")
	private Integer state;
	
	private Request() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setTipo(Integer type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	public void setToid(User toid){
		this.toid = toid;
	}
	public void setFromid(User fromid){
		this.fromid = fromid;
	}
	public User getFromid(){
		return fromid;
	}
	public User getToid(){
		return toid;
	}
}

