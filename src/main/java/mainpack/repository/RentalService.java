package mainpack.repository;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class RentalService {
    private static EntityManagerFactory ef = Persistence.createEntityManagerFactory("rentalservice");
    private static EntityManager em = ef.createEntityManager();
    private static Scanner scanner = new Scanner(System.in);
    public void addMovie(){
        System.out.println("enter movie to add");
        String name = scanner.nextLine();
        Movie movie = Movie.builder().id(null).name(name).amount(1).avalaible(true).build();
        em.getTransaction().begin();
        em.persist(movie);
        em.getTransaction().commit();
        System.out.println("added");
    }
    public void addCostumer(){
        System.out.println("enter email");
        String email = scanner.nextLine();
        System.out.println("password: ");

    }
}
