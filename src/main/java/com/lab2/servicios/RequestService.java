package com.lab2.servicios;
import java.util.List;

import com.lab2.modelo.Request;
import com.lab2.modelo.User;

public interface RequestService{
	//public User findUserByEmail(String email);
	public void saveRequest(Request request);
	public List<Request> findAllRequests();
	public List<Request> findByUser(User user);
	public List<Request> getFromByUser();
	public List<Request> getToByUser();
}