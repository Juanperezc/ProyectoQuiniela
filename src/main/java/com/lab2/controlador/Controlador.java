package com.lab2.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//
@Controller
public class Controlador {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	@RequestMapping("/quiniela")
	public String showQuiniela() {
		return "quiniela";
	}
	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
	@RequestMapping("/profile")
	public String showProfile() {
		return "profile";
	}
	@RequestMapping("/request")
	public String showRequest() {
		return "request";
	}
	@RequestMapping("/report")
	public String showReport() {
		return "report";
	}
	@RequestMapping("/manage_accounts")
	public String showMAccount() {
		return "manage_accounts";
	}
	@RequestMapping("/pag2")
	public String showPag2() {
		return "500";
	}
	
}
