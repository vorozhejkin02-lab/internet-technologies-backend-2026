package ac.rs.singidunum.itws.controller;


import ac.rs.singidunum.itws.entity.Airline;
import ac.rs.singidunum.itws.repo.AirlineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/airline")
public class AirlineController {

    private final AirlineRepository repository;

    @GetMapping
    public List<Airline> getAirlines() {
        return repository.findAll();
    }

}
