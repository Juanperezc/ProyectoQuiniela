package com.lab2.modelo;

import java.util.ArrayList;
import java.util.List;

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

@Entity
@Table(name = "sport")

public class Sport extends AuditModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "sport_id")
    private int id;
    
    @Column(name = "name")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY,
    cascade =  javax.persistence.CascadeType.ALL,
	mappedBy = "sport")
	private List<Quiniela> quiniela = new ArrayList<>();
 
	
	@OneToMany(fetch = FetchType.LAZY,
    cascade =  javax.persistence.CascadeType.ALL,
    mappedBy = "sport")
	private List<Liga> liga = new ArrayList<>();


	
	private Sport() {
		
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
	public List<Liga> getLiga(){
		return liga;
	}
	public void setLiga(List<Liga> liga){
		this.liga = liga;
	}


}

