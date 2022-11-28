package com.example.springvacmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logicPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String mainPage(ModelMap model, @RequestParam String userId, @RequestParam String password){
        if(userId.equals("admin") && password.equals("root")){
            return "main";
        }
        model.put("errorMsg", "Please provide correct User ID and Password!");
        return "login";
    }
}
