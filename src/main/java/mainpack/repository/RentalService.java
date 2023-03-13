package mainpack.repository;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RentalService {
    private static EntityManagerFactory ef = Persistence.createEntityManagerFactory("rentalservice");
    private static EntityManager em = ef.createEntityManager();
    private static Scanner scanner = new Scanner(System.in);

    public void addMovie() {
        System.out.println("enter movie to add");
        String name = scanner.nextLine();
        // Movie movie = Movie.builder().id(null).name(name).amount(1).avalaible(true).build();
        em.getTransaction().begin();
        //em.persist(movie);
        em.getTransaction().commit();
        System.out.println("added");
    }

    public void addCostumer() {
        System.out.println("enter email");
        String email = scanner.nextLine();
        System.out.println("password: ");
        String password = scanner.nextLine();
        Costumer costumer = new Costumer(email, password);
        em.getTransaction().begin();
        em.persist(costumer);
        em.getTransaction().commit();
        em.close();
        ef.close();
    }

    public void rentMovie() {
        System.out.println("what id account you are going chose?");
        int id = scanner.nextInt();
        Costumer costumerrent = em.find(Costumer.class, id);
        if (costumerrent == null) {
            System.out.println("invalid ID");
        } else {
            System.out.println("chose the movie");
            int IDmovie = scanner.nextInt();
            Movie movierented = em.find(Movie.class, IDmovie);
            if (movierented == null) {
                System.out.println("invalid ID movie");
            } else {
                movierented.setAvalaible(false);
                movierented.setAmount(0);
                List<Movie> movies = costumerrent.getMovies();
                movies.add(movierented);
                costumerrent.setMovies(movies);
                em.getTransaction().begin();
                em.merge(costumerrent);
                em.merge(movierented);
                em.getTransaction().commit();
                em.close();
                ef.close();
                System.out.println("top");
            }
        }
    }

    public List<Costumer> Listmovies() {
        TypedQuery<Costumer> saci = em.createQuery("select t from Costumer t", Costumer.class);
        List<Costumer> costumerList = saci.getResultList();
        for (Costumer costumerss : costumerList) {
            System.out.println("Movie: " + costumerss.getMovies());
        }
        //public void fortop(){
        //      for(Costumer c: )
        //  }
        return costumerList;
    }
}

   // List<Costumer> Costumers;
    //    Costumers = em.createQuery("select c from Costumer c").getResultList();

            //    return Costumers;