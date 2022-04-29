package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Cases {
    @EmbeddedId
    private Long case_id;
    @ManyToOne
    @MapsId("country_id")
    @JoinColumn(name = "country_id")
    Country country;

    @ManyToOne
    @MapsId("date_id")
    @JoinColumn(name = "date_id")
    Date date;

    Long caseno;
}
