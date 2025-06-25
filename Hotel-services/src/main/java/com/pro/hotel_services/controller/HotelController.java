package com.pro.hotel_services.controller;

import com.pro.hotel_services.model.Hotel;
import com.pro.hotel_services.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
@Slf4j
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping("/")
    public Hotel saveHotel(@RequestBody Hotel hotel) {
        log.info("Inside saveHotel method from HotelController");
        return hotelService.saveHotel(hotel);
    }
    @GetMapping("/{id}")
    public Hotel findHotelById(@PathVariable("id") Long id) {
        log.info("Inside findHotelById method from HotelController");
        return hotelService.findHotelById(id);
    }
   
}
