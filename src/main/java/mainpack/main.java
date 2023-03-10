package mainpack;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;
import mainpack.repository.RentalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {

       RentalService rs = new RentalService();
       // rs.addMovie();
        //rs.addCostumer();
        //rs.rentMovie();

            for(Costumer c: rs.Listmovies()){
                System.out.println("movies: "+c.getMovies());
            }

    }
}
