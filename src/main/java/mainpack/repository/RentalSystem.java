package mainpack.repository;

import mainpack.dominio.Costumer;
import mainpack.dominio.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RentalSystem {

   private static EntityManagerFactory ef = Persistence.createEntityManagerFactory("rentalservice");
   private static EntityManager em = ef.createEntityManager();
    public void addCostumer(Costumer costumer){
        Costumer oldcostumer = em.find(Costumer.class, costumer.getEmail());
        if(oldcostumer == null){
            em.getTransaction().begin();
            em.persist(costumer);
            em.getTransaction().commit();
        } else throw new RuntimeException("This email is already used");
    }

    }

