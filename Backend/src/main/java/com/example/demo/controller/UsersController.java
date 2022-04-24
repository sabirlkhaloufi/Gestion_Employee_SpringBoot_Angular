package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    @Autowired
    private final UserServiceImpl userService;
    //creating a get mapping that retrieves all the users detail from the database
    @GetMapping("/")
    public ResponseEntity<List<AppUser>> GetUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
    //creating a get mapping that retrieves the detail of a specific user
    @GetMapping("/{userid}")
    public ResponseEntity<AppUser> GetUserById(@PathVariable("userid") Long userId){
        return ResponseEntity.ok().body(userService.getUserById(userId));

    }
//creating a delete mapping that deletes a specified user

    @DeleteMapping("/{userid}")
    public Long DeleteUser(@PathVariable("userid") Long userid){
        return userService.deleteUser(userid);
    }
    //creating post mapping that post the user detail in the database
    @PostMapping("/")
    public AppUser AddUser(@RequestBody AppUser user){
            return user;
    }
    //creating put mapping that updates the user detail
    @PutMapping("/")
    public AppUser updateUser(@RequestBody AppUser user){
        return user;
    }



}
