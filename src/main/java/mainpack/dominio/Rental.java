package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Value
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Costumer costumer;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Costumer customer;
}
