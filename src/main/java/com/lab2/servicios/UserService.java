package com.lab2.servicios;
import com.lab2.modelo.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}