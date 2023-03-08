package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Builder
@Value
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer amount;
    private Boolean avalaible;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<Rental> rentals = new HashSet<>();
}
