package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/login")
@RequiredArgsConstructor
public class LoginController {
    private final UserServiceImpl userService;
    @PostMapping("/")
    public ResponseEntity<AppUser> login(@RequestBody AppUser user){
        AppUser user1 = userService.getUser(user.getUsername());
        String pass = user.getPassword();
        String pass1 = user1.getPassword();
        if(pass.equals(pass1)){
            return ResponseEntity.ok().body(user1);
        }

        return ResponseEntity.ok().body(user);
    }


}
