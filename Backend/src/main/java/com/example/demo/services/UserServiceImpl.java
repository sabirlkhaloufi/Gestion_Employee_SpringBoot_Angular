package com.example.demo.services;

import com.example.demo.model.AppUser;
import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional

public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userRepo.findAppUserByUsername(username);
        if(user == null){
            System.out.println("User not found");
        }
        else{
            System.out.println("User  found");
        }
        Collection<SimpleGrantedAuthority> authorities =  new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        });
        return new User(user.getUsername(),user.getPassword(),authorities);
    }
    public AppUser saveUser(AppUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
    public Role saveRole(Role role){
        return roleRepo.save(role);
    }
    public void addRoleToUser(String username,String roleName){
        AppUser user = userRepo.findAppUserByUsername(username);
        Role role = roleRepo.findRoleByRole(roleName);
        user.getRoles().add(role);
    }
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
