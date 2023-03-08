package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email ;
    private String password;

    @OneToMany(mappedBy = "costumer", cascade = CascadeType.ALL)
    private Set<Rental> rentals = new HashSet<>();
}
