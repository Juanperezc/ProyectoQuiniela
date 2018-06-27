package com.lab2.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity(name = "Quiniela")
@Table(name = "quiniela")
public class Quiniela extends AuditModel {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quiniela_id")
    private int id;
    //privada 1 y publica 2
    @Column(name = "type")
    @NotNull(message = "*Porfavor ingrese un tipo de quiniela")
    private Integer type;
    @Column(name = "name")
    @NotEmpty(message = "*Porfavor ingrese un nombre a la quiniela")
    private String name;
    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    @NotNull(message = "*Porfavor ingrese una fecha de inicio")
    private Date start;
    @Column(name = "end_date")
    @NotNull(message = "*Porfavor ingrese una fecha de finalizacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date end;
    @Column(name = "description")
    @NotEmpty(message = "*Porfavor ingrese una descripcion")
    private String description;

    @Column(name = "imagenFondo")
    private String imagenFondo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id")
    private User admin;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @OneToOne(
        fetch = FetchType.LAZY,
        cascade = javax.persistence.CascadeType.ALL,
        mappedBy = "quiniela"
        
    )
    private Rule rule;

    @JsonIgnore
    @ManyToMany(mappedBy = "quinielas")
    private List<User> users = new ArrayList<>(); 
    
    /* @OneToMany(
        mappedBy = "quiniela",
        cascade = javax.persistence.CascadeType.ALL,
        orphanRemoval = true
    )
    private List<QuinielaUser> users = new ArrayList<>(); */

    @OneToMany(
        mappedBy = "quiniela",
        cascade = javax.persistence.CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Game> games = new ArrayList<>();


    public Quiniela(){
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
    public void setType(Integer type) {
        this.type = type;
    }
    public User getAdmin() {
        return admin;
    }
    public void setAdmin(User admin) {
        this.admin = admin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStart() {
        return start;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
    public Date getEnd() {
        return end;
    }
    public void setStart(Date start) {
        this.start = start;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

    public void set(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    public String getimagenFondo() {
        return imagenFondo;
    }
     public void setUsers(List<User> users){
        this.users = users;
    } 

    public List<User>getUsers(){
        return users;
    } 

    public void addUser(User user){
        this.users.add(user);
    }

    public void setGames(List<Game> games){
        this.games = games;
    }
    public void addGame(Game game){
        this.games.add(game);
    }
    public List<Game>getGames(){
        return games;
    }

    public Rule getRule(){
        return rule;
    }

    public void setRule(Rule rule){
        this.rule = rule;
    }

}
