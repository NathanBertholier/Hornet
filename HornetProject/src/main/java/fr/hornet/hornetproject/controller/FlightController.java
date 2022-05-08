package fr.hornet.hornetproject.controller;

import fr.hornet.hornetproject.entities.FlightEntity;
import fr.hornet.hornetproject.repository.FlightEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/flight")
public class FlightController {
    private final FlightEntityRepository flightRepository;

    @Autowired
    public FlightController(FlightEntityRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/{id}")
    public FlightEntity findById(@PathVariable String id) {
        return flightRepository.getById(id);
    }

}
