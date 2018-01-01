package info.ishans.spring.reservationservice;

import info.ishans.spring.reservationservice.reservations.Reservation;
import info.ishans.spring.reservationservice.reservations.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ReservationServiceApplication {

	@Bean
	CommandLineRunner commandLineRunner (ReservationRepository reservationRepository){
		return strings -> {
			Stream.of("Ishan", "Sureka", "Rushen", "Sahan", "Tharindu")
					.forEach(name->reservationRepository.save(new Reservation(name)));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}
}
