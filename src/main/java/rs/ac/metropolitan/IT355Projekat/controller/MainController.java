package rs.ac.metropolitan.IT355Projekat.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import rs.ac.metropolitan.IT355Projekat.entity.Destination;
import rs.ac.metropolitan.IT355Projekat.service.DestinationService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600, allowCredentials = "true")
@AllArgsConstructor
@RestController
@RequestMapping("/api/destinations")
public class MainController {

    private final DestinationService destinationService;

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<Destination>> getAllDestinations(){
        return ResponseEntity.ok(destinationService.findAll());
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Destination> save(@RequestBody Destination destination){
        return ResponseEntity.ok(destinationService.save(destination));
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Destination> update(@RequestBody Destination destination){
        return ResponseEntity.ok(destinationService.update(destination));
    }

    @DeleteMapping("/{destinationId}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteById(@PathVariable Integer destinationId){
        destinationService.deleteDestination(destinationId);
    }

    @GetMapping("/{destinationId}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Destination> getDestinationById(@PathVariable Integer destinationId){
        return ResponseEntity.ok(destinationService.findById(destinationId));
    }

}
