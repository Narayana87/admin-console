package com.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginView(){
        System.out.println("Inside LoginController loginView()");
        return "login";
    }
}
