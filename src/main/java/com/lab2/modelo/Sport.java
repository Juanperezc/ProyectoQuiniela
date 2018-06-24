package com.lab2.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity(name="Sport")
@Table(name = "sport")
public class Sport extends AuditModel {

    private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sport_id")
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "*Porfavor ingresa un texto")
    private String name;

    @Column(name = "img")
    private String img;

    @OneToMany(
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        mappedBy = "sport"
    )
    private List<Liga> liga = new ArrayList<>();

    @OneToMany(
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        mappedBy = "sport"
    )
    private List<Quiniela> quinielas = new ArrayList<>();

    public Sport() {}

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
    /*public List<Liga> getLiga(){
		return liga;
	}
	public void setLiga(List<Liga> liga){
		this.liga = liga;
	}

    /*	public List<Quiniela> getQuinielas(){
		return quinielas;
	}
	public void setQuinielas(List<Quiniela> quinielas){
		this.quinielas = quinielas;
	}*/

}
