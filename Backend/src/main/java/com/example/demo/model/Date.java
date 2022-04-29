package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
=======

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "date")
public class Date {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false,name = "date_id")
    private Long id;

    @Column(nullable = false,updatable = false,name = "year")
    private Long year;
    @Column(nullable = false,updatable = false,name = "month")
    private Long month;
    @Column(nullable = false,updatable = false,name = "month")
    @ManyToMany
    @JoinTable(
            name = "country_date",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "date_id"))
    private Collection<Country> countries;

}
