package ac.rs.singidunum.itws.controller;


import ac.rs.singidunum.itws.entity.Airline;
import ac.rs.singidunum.itws.repo.AirlineRepository;
import ac.rs.singidunum.itws.service.AirlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping(path = "/api/airline")
public class AirlineController {

    private final AirlineService service;

    @GetMapping
    public List<Airline> getAll() {
        return service.getAirlines();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Airline> getById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getAirlineById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@RequestBody Airline airline) {
        service.createAirline(airline);
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody Airline airline) {
        service.updateAirline(id, airline);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        service.deleteAirline(id);
    }
}
