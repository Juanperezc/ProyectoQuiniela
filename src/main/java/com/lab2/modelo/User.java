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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Transient;

@Entity(name = "User")
@Table(name = "users")
public class User extends AuditModel{

	private static final long serialVersionUID = -5657647023544068786L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@Column(name = "email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;
	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;
	@Column(name = "active")
	private int active;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles = new ArrayList<>();
	;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "quiniela_user", 
        joinColumns = { @JoinColumn(name = "user_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "quiniela_id") }
    )
    private List<Quiniela> quinielas = new ArrayList<>();

	/* @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = true
	)	
	private List<QuinielaUser> quinielas = new ArrayList<>(); */

	@OneToMany(
		mappedBy = "user",
		cascade = javax.persistence.CascadeType.ALL,
		orphanRemoval = true)	
	private List<GameUser> games = new ArrayList<>();

	@OneToMany(
        mappedBy = "user",
        cascade = javax.persistence.CascadeType.ALL
    )
	private List<Liga> ligas = new ArrayList<>();

	/*@OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL
	)
	private List<Request> sent = new ArrayList<>();
	
	/*@OneToMany(
        mappedBy = "idto",
        cascade = javax.persistence.CascadeType.ALL,
        orphanRemoval = true
    )
	private List<Request> taken = new ArrayList<>();*/
	

	/* @OneToMany(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "user")
	private List<User> admins = new ArrayList<>(); */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public void addRole(Role role) {
		this.roles.add(role);
	}
	public List<Liga> getLigas() {
		return ligas;
	}
	public void setLigas(List<Liga> ligas) {
		this.ligas = ligas;
	}

	public List<Quiniela> getQuinielas() {
		return quinielas;
	}
	public void setQuinielas(List<Quiniela> quinielas) {
		this.quinielas = quinielas;
	}

	public void addQuiniela(Quiniela quiniela) {
		this.quinielas.add(quiniela);
	}

	/*public List<Request> getSent() {
		return sent;
	}
/*	public List<Request> getTaken() {
		return taken;
	}*/
}