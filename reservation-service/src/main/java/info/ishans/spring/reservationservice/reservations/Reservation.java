package info.ishans.spring.reservationservice.reservations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;
    private String reservationName;


    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public String getReservationName() {
        return reservationName;
    }
}
