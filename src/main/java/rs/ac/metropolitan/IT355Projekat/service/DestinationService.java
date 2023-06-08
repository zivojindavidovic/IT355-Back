package rs.ac.metropolitan.IT355Projekat.service;

import rs.ac.metropolitan.IT355Projekat.entity.Destination;

import java.util.List;

public interface DestinationService {
    List<Destination> findAll();

    Destination findById(Integer destinationId);

    Destination save(Destination destination);

    Destination update(Destination destination);

    void deleteDestination(Integer destinationId);

}
