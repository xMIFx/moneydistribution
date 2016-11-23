package com.xMIFx.SEAP.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
    @RequestMapping("/login")
    @ResponseBody
    String login() {
        return "Hello World Login!";
    }
}
