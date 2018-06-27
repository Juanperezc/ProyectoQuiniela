package com.lab2.servicios;
import java.util.List;
import java.util.Map;

import com.lab2.modelo.Quiniela;
import com.lab2.modelo.User;




public interface UserService {
	public User findUserByEmail(String email);
	public User findUserByid(Integer id);
	public void saveUser(User user);
	public void saveNew(User user);
	public User getAuthUser();
	public List<User> findByQuiniela(Quiniela quiniela);
	public List<User> findAll();
	public List<User> findAllWithoutAdmin();
	public Map<String, String> countTypeUser();
}