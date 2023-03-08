package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Builder
@Value
@Entity
public class Costumer {
    private Integer id;
    private String email ;
    private String pasword;

    @OneToMany(mappedBy = "custumer", cascade = CascadeType.ALL)
    private Set<Rental> rentals = new HashSet<>();
}
