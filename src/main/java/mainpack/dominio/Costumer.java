package mainpack.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Entity
public class Costumer implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = getId();

    private String email = getEmail();
    private String password= " ";

   @OneToMany(cascade = {CascadeType.MERGE}, mappedBy = "costumers")                                  //(mappedBy = "custumer", cascade = CascadeType.ALL)
    private List<Movie> movies;

    public Costumer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Costumer(Integer id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Costumer() {

    }
}
