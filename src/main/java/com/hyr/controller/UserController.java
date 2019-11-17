package com.hyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/toLogin.do")
    public String toLogin(){
        System.out.println("heiheiehei");
        return "login";
    }
}
