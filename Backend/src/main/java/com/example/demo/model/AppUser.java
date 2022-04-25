package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employees")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false,name = "employee_id")
    private Long id;
    @Column(nullable = false,updatable = false,name = "username",unique = true)
    private String username;
    @Column(name="fullname")
    private  String fullname;
    @Column(name="adresse")
    private String adresse;
    @Column(name="sexe")
    private char sexe;
    @Column(name="phone")
    private String phone;
    @Column(nullable = false,updatable = false,name = "password")
    private String password;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "dateofjoin")
    private String dateofjoin;
    @Column(name = "roles")
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

    @Override
    public String toString() {
        return "AppUser{" +
                "'id'=" + id +
                ", 'username'='" + username + '\'' +
                ", 'fullname'='" + fullname + '\'' +
                ", 'adresse'='" + adresse + '\'' +
                ", 'sexe'='" + sexe + '\''+
                ", 'status'=" + status +
                ", 'dateofjoin'='" + dateofjoin + '\''+
                ", 'roles'=" + roles +
                '}';
    }
}
