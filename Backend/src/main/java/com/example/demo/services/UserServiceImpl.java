package com.example.demo.services;

import com.example.demo.model.AppUser;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional

public class UserServiceImpl {
    @Autowired
    private final UserRepository userRepo;
    public AppUser getUser(String username) {
            return userRepo.findAppUserByUsername(username);
    }
    public AppUser getUserById(Long id){
        return userRepo.findAppUserById(id);
    }
    public List<AppUser> getAllUsers() {
        List<AppUser> users = new ArrayList<>();
        userRepo.findAll().forEach(user->users.add(user));
        return users;
    }
    public Long deleteUser(Long id){
        return  userRepo.deleteAppUserById(id);

    }
    public AppUser postUser(AppUser user){
        userRepo.save(user);
        return  user;
    }




}
