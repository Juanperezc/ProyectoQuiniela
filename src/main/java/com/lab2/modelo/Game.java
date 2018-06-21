package com.lab2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "game")

public class Game extends AuditModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7179974750035592569L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="game_id")
	private int id;
	@Column(name="team1")
	private String team1;
	@Column(name="team2")
    private String team2;
    @Column(name="date")
    private Date date;
    @Column(name="description")
    private String description;

    @Column(name="score_team1")
    private int scoreTeam1;

    @Column(name="score_team2")
    private int scoreTeam2;

    @Column(name="state")
    private int state;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiniela_id", nullable = false)
	private Quiniela quiniela; 
	
	@OneToMany(
		mappedBy = "game",
		cascade = javax.persistence.CascadeType.ALL,
		orphanRemoval = true)	
	private List<GameUser> users = new ArrayList<>();

    private Game(){
    	
    }
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
    }

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getScoreTeam1() {
		return scoreTeam1;
	}

	public void setScoreTeam1(int scoreTeam1) {
		this.scoreTeam1 = scoreTeam1;
	}

	public int getScoreTeam2() {
		return scoreTeam2;
	}

	public void setScoreTeam2(int scoreTeam2) {
		this.scoreTeam2 = scoreTeam2;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
   
    
}
