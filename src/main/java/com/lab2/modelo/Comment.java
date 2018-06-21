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
@Table(name = "comment")

public class Comment extends AuditModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "comment_id")
    private int id;
    
    @Column(name = "mensaje")
	private String mensaje;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiniela_user_id", nullable = false)
	private QuinielaUser quinielaUser;

	
	
	private Comment() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setName(String mensaje) {
		this.mensaje = mensaje;
	}


}

