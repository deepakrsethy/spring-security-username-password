package com.deepak.spring_security_username_password.controller;

import com.deepak.spring_security_username_password.domain.DBUserDetails;
import com.deepak.spring_security_username_password.service.DBUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private DBUserDetailsService DBUserDetailsService;

    @RequestMapping("/health")
    public String checkHealth(){
        return "OKey-Dockey";
    }

    @RequestMapping("/users")
    public List<DBUserDetails> getAllUsers(){
        return DBUserDetailsService.getAllUsers();
    }


}
