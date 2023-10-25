package com.example.locationapi.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private  int id;
    @Column(nullable = false)
    private double latitude;
    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(nullable = false,length = 25)
    private String imei;

    public Position(double latitude, double longitude, Date date, String imei) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.imei = imei;
    }
}
