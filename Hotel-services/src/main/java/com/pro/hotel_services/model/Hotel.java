package com.pro.hotel_services.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long user_id;
    private String name;
    private String location;
    private String details;
    private int available_rooms;
    private String price_per_night;
    private int stars;
}

