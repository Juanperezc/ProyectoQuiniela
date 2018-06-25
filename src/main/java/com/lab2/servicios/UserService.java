package com.lab2.servicios;
import com.lab2.modelo.User;



public interface UserService {
	public User findUserByEmail(String email);
	public User findUserByid(Integer id);
	public void saveUser(User user);
	public void save(User user);
	public User getAuthUser();
}