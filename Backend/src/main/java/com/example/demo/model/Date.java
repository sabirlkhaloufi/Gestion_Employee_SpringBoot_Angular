package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
}
