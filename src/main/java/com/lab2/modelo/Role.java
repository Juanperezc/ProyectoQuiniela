package com.lab2.modelo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "role")
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private int id;
	@Column(name="role")
	private String role;
	@JsonIgnore
    @ManyToMany(mappedBy = "quinielas")
	private List<User> users = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
}
