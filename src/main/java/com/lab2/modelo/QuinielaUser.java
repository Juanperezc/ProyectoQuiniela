package com.lab2.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "QuinielaUser")
@Table(name = "quiniela_user")

public class QuinielaUser extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quiniela_user_id")
    private int id;

	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("quiniela_id")
	private Quiniela quiniela;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("user_id")
    private User user;

	private QuinielaUser() {
	
	}
	public void setId(int id) {
			this.id = id;
	}

	public int getId() {
		return id;
	}

}

