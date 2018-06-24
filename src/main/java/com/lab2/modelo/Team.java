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
@Table(name = "team")

public class Team extends AuditModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "team_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "img")
	private String img;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "liga_id", nullable = false)
	private Liga liga;

	
	public Team() {
		
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
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


}

