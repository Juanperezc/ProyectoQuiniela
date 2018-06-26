package com.lab2;
import java.util.List;

import com.lab2.modelo.Sport;
import com.lab2.modelo.User;
import com.lab2.servicios.SportService;
import com.lab2.servicios.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(basePackages = {
    "com.lab2.controlador"
})
public class GlobalControllerAdvice {

    @Autowired UserService userService;
    @Autowired SportService sportService;


    @ModelAttribute
   // @PreAuthorize("isAuthenticated()")
    public void globalAttributes(Model model) {
        User user = userService.getAuthUser(); 
        List<Sport> sports = sportService.findAll();
        model.addAttribute("currentUser", user);
        //  User user = userService.getAuthUser();

    }

}