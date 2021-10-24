package com.boot.alberto.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.alberto.bean.User;

@Controller
public class SignUpController {
	
    @GetMapping(path ={"/register","/"})
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);                    
        return "signup";
    }
    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) {
    		return "signup";
    	}
    	else {  		
    	        return "success";
    	}
       
    }
	
}
