package rs.ac.metropolitan.IT355Projekat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import rs.ac.metropolitan.IT355Projekat.entity.Destination;
import rs.ac.metropolitan.IT355Projekat.repository.DestinationRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class It355ProjekatApplicationTests {

	@Test
	void contextLoads() {
	}

	@MockBean
	private DestinationRepository destinationRepository;

	@Test
	void saveDestinationTest(){
		Destination destination = Destination.builder()
				.destination("testDestination")
				.image("testImage")
				.build();
		when(destinationRepository.save(destination)).thenReturn(destination);
		System.out.println(destination);
		assertEquals(destination, destinationRepository.save(destination));
	}

	@Test
	void findDestinations(){
		Destination destination1 = Destination.builder()
				.destination("Destination to find1")
				.image("testImage")
				.build();
		Destination destination2 = Destination.builder()
				.destination("Destination to find2")
				.image("testImage")
				.build();

		List<Destination> destinationList = new ArrayList<>();
		destinationList.add(destination1);
		destinationList.add(destination2);

		when(destinationRepository.findAll()).thenReturn(destinationList);

		Integer expectedDestinations = 2;

		assertEquals(expectedDestinations, destinationRepository.findAll().size());
		assertTrue(destinationRepository.findAll().contains(destination1));
		assertTrue(destinationRepository.findAll().contains(destination2));
	}

}
