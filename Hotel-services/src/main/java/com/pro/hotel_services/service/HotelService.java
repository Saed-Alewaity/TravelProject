package com.pro.hotel_services.service;

import com.pro.hotel_services.model.Hotel;
import com.pro.hotel_services.repository.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class    HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public Hotel saveHotel(Hotel hotel) {
        log.info("Inside saveHotel method from HotelService");

        return hotelRepository.save(hotel);
    }

    public Hotel findHotelById(Long id) {
        log.info("Inside findHotelById method from HotelService");
        return hotelRepository.findHotelById(id);

    }
}
