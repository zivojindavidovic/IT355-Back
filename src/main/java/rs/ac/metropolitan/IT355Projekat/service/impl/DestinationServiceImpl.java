package rs.ac.metropolitan.IT355Projekat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rs.ac.metropolitan.IT355Projekat.entity.Destination;
import rs.ac.metropolitan.IT355Projekat.repository.DestinationRepository;
import rs.ac.metropolitan.IT355Projekat.service.DestinationService;

import java.util.List;

@Service
@AllArgsConstructor
public class DestinationServiceImpl implements DestinationService {

    private final DestinationRepository destinationRepository;


    @Override
    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    @Override
    public Destination findById(Integer destinationId) {
        return destinationRepository.findById(destinationId).get();
    }

    @Override
    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public Destination update(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public void deleteDestination(Integer destinationId) {
        destinationRepository.deleteById(destinationId);
    }

}
