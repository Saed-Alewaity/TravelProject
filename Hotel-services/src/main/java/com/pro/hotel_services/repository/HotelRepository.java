package com.pro.hotel_services.repository;

import com.pro.hotel_services.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Hotel findHotelById(Long id);
}
