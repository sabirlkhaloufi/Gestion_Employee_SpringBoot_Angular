package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Collection;
=======


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false,name = "country_id")
    private Long id;

    @Column(nullable = false,updatable = false,name = "country")
    private Long country;

    @ManyToMany(mappedBy = "countries")

    private Collection<Date> dates;

}
