package com.lab2.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "GameUser")
@Table(name = "game_user")

public class GameUser extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "game_user_id")
    private int id;

	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("game_id")
	private Game game;

	@Column(name = "prognostic_T1")
	private int prognosticT1;
	
	@Column(name = "prognostic_T2")
    private int prognosticT2;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("user_id")
	private User user;
	

	private GameUser() {
	
	}
	public void setId(int id) {
			this.id = id;
	}

	public int getPrognosticT1() {
		return prognosticT1;
	}

	public void setprognosticT1(int prognosticT1) {
			this.prognosticT1 = prognosticT1;
	}

	public int getPrognosticT2() {
		return prognosticT2;
	}

	public void setprognosticT2(int prognosticT2) {
			this.prognosticT2 = prognosticT2;
	}


	

}

