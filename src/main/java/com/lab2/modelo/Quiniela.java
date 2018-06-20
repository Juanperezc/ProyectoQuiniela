package com.lab2.modelo;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

import java.util.Date;
@Entity
@Table(name = "Quiniela")
public class Quiniela extends AuditModel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="quiniela_id")
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="name")
    private String name;
    @Column(name="start_date")
    private Date start;
    @Column(name="end_date")
    private Date end;

    @Column(name="sport")
    private String sport;

    @Column(name="description")
    private String description;

    @Column(name="imagenFondo")
    private String imagenFondo;


    @OneToOne(fetch = FetchType.LAZY,
    cascade =  javax.persistence.CascadeType.ALL,
    mappedBy = "quiniela")
    private Rule regla; 


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
   
    public void setSport(String sport) {
		this.sport = sport;
    }
    public String getSport() {
		return sport;
    }
    public void setDescription(String description) {
		this.description = description;
    }
    public Date getDescription() {
        return end;
    }
    public void set(String imagenFondo) {
		this.imagenFondo = imagenFondo;
    }
    public String getimagenFondo() {
		return imagenFondo;
    }
    
}
