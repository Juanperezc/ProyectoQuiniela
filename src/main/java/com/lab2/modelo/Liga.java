package com.lab2.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "liga")
public class Liga extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "liga_id")
	private int id;

	@Column(name = "name")
	@NotEmpty(message = "*Porfavor ingresa un nombre")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sport_id", nullable = true)
	private Sport sport;

    @OneToMany(
        mappedBy = "liga",
        cascade = javax.persistence.CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Team> teams = new ArrayList<>();

	
	public Liga() {

	}
	public void addTeam(Team team){
		this.teams.add(team);
	}
	public void setTeams(List<Team> teams){
		this.teams = teams;
	}
	public List<Team> getTeams(){
	return teams;
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
  	public Sport getSport(){
	  return sport;
 	}
  	public void setSport(Sport sport){
		  this.sport = sport;
	}

	/*public User getUser() {
		return user;
	}
*/
	public void setUser(User user) {
		this.user = user;
	}

	/*@Override
	public String toString() {
		return (Integer)getId();
	}*/

	
	
}
