package com.pro.flight.services.repository;

import com.pro.flight.services.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    Flight findFlightById(Long id);
}
