package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String m(Model model){
        model.addAttribute("title", "");
        return "index";
    }

}
