package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login(Model model){
        System.err.println("aaaa111");
        return "login/login";
    }

    @GetMapping("/home`")
	public String goHome(HttpServletRequest request) {
		return "content/home";
	}
}
