package mainpack;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;
import mainpack.repository.RentalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        Movie movie = Movie.builder().id(null).name("harry Potter").avalaible(true).amount(1).build();
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("rentalservice");
        EntityManager em = ef.createEntityManager();
        em.getTransaction().begin();
        em.persist(movie);
        em.getTransaction().commit();
        em.close();
        ef.close();
    }
}
