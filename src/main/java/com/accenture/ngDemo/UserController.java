package com.accenture.ngDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userService.save(user);
    }


}
