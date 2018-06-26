package com.lab2.servicios;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.lab2.modelo.Request;
import com.lab2.modelo.User;
import com.lab2.modelo.Quiniela;
import com.lab2.repositorio.RequestRepository;
import com.lab2.repositorio.UserRepository;


@Service("requestService")
public class RequestServiceImpl implements RequestService{

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserService userService;
	@Override
	public void saveRequest(Request request) {
		requestRepository.save(request);
	}

	@Override
	public List<Request> findAllRequests(){
		return requestRepository.findAll();
	}
	@Override
	public List<Request> findByUser(User user){
		return requestRepository.findByFromid(user);
	}
	@Override
	public List<Request> getFromByUser(){
	User user = userService.getAuthUser();
	return requestRepository.findByFromid(user);
	}
	@Override
	public List<Request> getToByUser(){
	User user = userService.getAuthUser();
	return requestRepository.findByToid(user);
	}
	@Override
	public boolean isrequestQuiniela(Quiniela quiniela,User user){
		List<Request> requests = requestRepository.findByFromid(user);
		for (Request r :requests) {
			if (r.getQuiniela() != null){
				if(r.getQuiniela().equals(quiniela))
				return true;
			}
			
		}
		return false;

	}
	@Override
	public boolean isrequestAdmin(User user){
		List<Request> requests = requestRepository.findByFromid(user);
		User admin = userService.findUserByid(1);
		for (Request r :requests) {
			if(r.getToid().equals(admin))
			return true;
		}
		return false;

	}

	@Override
	public Request findByUsuarioAndQuiniela(User user, Quiniela quiniela) {
		List<Request> requests = requestRepository.findByFromid(user);
		for (Request r :requests) {
			if (r.getQuiniela() != null){
				if(r.getQuiniela().equals(quiniela))
				return r;
		}
	}
		return null;
	}

	@Override
	public Request findByUserAdmin(User user) {
		List<Request> requests = requestRepository.findByFromid(user);
		User admin = userService.findUserByid(1);
		for (Request r :requests) {
			if(r.getToid().equals(admin))
			return r;
		}
		return null;
	}
}