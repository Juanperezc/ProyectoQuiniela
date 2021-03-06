package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Request;
import com.lab2.modelo.User;
import com.lab2.modelo.Quiniela;

public interface RequestService{
	//public User findUserByEmail(String email);
	public void saveRequest(Request request);
	public List<Request> findAllRequests();
	public List<Request> findByUser(User user);
	public List<Request> getFromByUser();
	public List<Request> getToByUser();
	public Request isrequestQuiniela(Quiniela quiniela,User user);
	public Request isrequestAdmin(User user);
	public Request findByUsuarioAndQuiniela(User user,Quiniela quiniela);
	public Request findByUserAdmin(User user);
	
}