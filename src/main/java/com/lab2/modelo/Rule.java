package com.lab2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rule")
public class Rule extends AuditModel{

	private static final long serialVersionUID = -8653382979348036615L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rule_id")
    private int id;
    //puntaje para los que acierten el equipo ganador
	@Column(name = "victor_score")
    private int victorScore;

    //puntaje para los que acierten el puntaje de cualquier equipo
    @Column(name = "team_score")
	private int teamScore;
	
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiniela_id", nullable = true)
    private Quiniela quiniela; 


    public Rule(){

    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
    }
    
    public int getVictorScore() {
		return victorScore;
	}

	public void setVictorScore(int victorScore) {
		this.victorScore = victorScore;
    }
    
    public int getTeamScore() {
		return teamScore;
	}

	public void setTeamScore(int teamScore) {
		this.teamScore = teamScore;
	}

	 public Quiniela getQuiniela() {
		return quiniela;
	}

	public void setQuiniela(Quiniela quiniela) {
		this.quiniela = quiniela;
	} 

}