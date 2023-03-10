package mainpack.dominio;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Value
@Builder
@Entity
public class Costumer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email ;
    private String password;

   @OneToMany(mappedBy = "costumers")                                  //(mappedBy = "custumer", cascade = CascadeType.ALL)
    private List<Movie> movies;
}
