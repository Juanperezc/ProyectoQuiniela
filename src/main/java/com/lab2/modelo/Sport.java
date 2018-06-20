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
@Table(name = "sport")

public class Sport extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "sport_id")
    private int id;
    
    @Column(name = "name")
	private String name;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "liga_id", nullable = false)
	private Liga liga;
	
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


}

