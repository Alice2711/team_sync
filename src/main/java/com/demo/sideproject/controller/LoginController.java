package com.demo.sideproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @GetMapping("/join")
    public String join() {
        return "login/join";
    }


}
