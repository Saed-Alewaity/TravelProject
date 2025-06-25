package com.pro.flight.services.controller;

import com.pro.flight.services.model.Flight;
import com.pro.flight.services.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
@Slf4j
public class FlightController {
    @Autowired
    private FlightService flightService;
    @PostMapping("/")
    public Flight saveFlight(@RequestBody Flight flight) {
        log.info("Inside saveFlight method from FlightController");
        return flightService.saveFlight(flight);
    }
    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable("id") Long id) {
        log.info("Inside findFlightById method from FlightController");
        return flightService.findFlightById(id);
    }
}
