package com.pro.flight.services.service;

import com.pro.flight.services.model.Flight;
import com.pro.flight.services.repository.FlightRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(Flight flight) {
        log.info("Inside saveFlight method from FlightService");

        return flightRepository.save(flight);
    }

    public Flight findFlightById(Long id) {
        log.info("Inside findFlightById method from FlightService");
        return flightRepository.findFlightById(id);

    }
}
