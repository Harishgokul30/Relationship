package com.example.User.Controller;

import com.example.User.Modules.User;
import com.example.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    public UserService service;

    @GetMapping
    public List<User> getall(){
        return service.getAllUser();
    }
    @PostMapping
    public String  saveUser(@RequestBody User user){
        return service.insertUser(user);
    }

    @DeleteMapping("/{id}")
    public  String deleteUser(@PathVariable long id){
        return service.deleteUser(id);
    }
}
