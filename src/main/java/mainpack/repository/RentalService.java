package mainpack.repository;

import mainpack.dominio.Movie;

import java.util.Scanner;

public class RentalService {
    private static Scanner scanner = new Scanner(System.in);
    public void addMovie(){
        System.out.println("enter movie to add");
        String name = scanner.nextLine();
        Movie movie = Movie.builder().name(name).amount(1).avalaible(true).build();
        System.out.println("added");
    }
}
