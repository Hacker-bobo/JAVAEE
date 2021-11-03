package com.bobo.controller;

import com.bobo.entity.Respon;
import com.bobo.entity.User;
import com.bobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/guanlian")
    public User guanlian(Integer id) {return userService.guanlian(id);}

    @PostMapping(value = "/api/login")
    public Respon login(@RequestBody User requestUser) {
        return userService.login(requestUser);
    }
}
