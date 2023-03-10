package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@Value
@Entity
public class Movie  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer amount;
    private Boolean avalaible;
    @ManyToOne
    @JoinColumn(name = "costumers_id")
    //(mappedBy = "movie", cascade = CascadeType.ALL)
    private Costumer costumers;                             //private List<Rental> rentals;
}
