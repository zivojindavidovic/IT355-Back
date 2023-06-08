package rs.ac.metropolitan.IT355Projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.metropolitan.IT355Projekat.entity.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
