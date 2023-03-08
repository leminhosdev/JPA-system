package mainpack.repository;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RentalSystem {

    EntityManagerFactory ef = Persistence.createEntityManagerFactory("rentalservice");
    EntityManager em = ef.createEntityManager();
  /*  public void addCustuomer(Costumer costumer){
        Costumer oldcostumer = em.find(Costumer.class, costumer.getEmail());
        if(oldcostumer == null){
            em.getTransaction().begin();
            em.persist(costumer);
            em.getTransaction().commit();
        } else throw new RuntimeException("This email is already used");
    }  */

    public void addMovie(Movie movie){
       // Movie oldmovie = em.find(Movie.class, movie.getName());
     //   if(oldmovie == null){
            em.getTransaction().begin();
            em.persist(movie);
            em.getTransaction().commit();
     //   } else {
        //    Movie newAmount = Movie.builder().id(oldmovie.getId()).name(oldmovie.getName()).amount(oldmovie.getAmount() + 1).avalaible(true).build();
       //     em.getTransaction().begin();
         //   em.merge(newAmount);
          //  em.getTransaction().commit();
        }
    }

