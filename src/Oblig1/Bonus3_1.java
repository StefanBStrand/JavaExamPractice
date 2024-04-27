package Oblig1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bonus3_1 {

    public static void main(String[] args) {

        // Remember to put SYSTEM.IN as the argument!
        Scanner scanner = new Scanner(System.in);

        //List<Planet> planets = new ArrayList<>();

        System.out.println("Name of planet to register: ");
        String registeredPLanet = scanner.nextLine();

        System.out.println("Enter radius of planet: ");
        double registeredRadius = scanner.nextDouble();

        System.out.println("Enter mass of planet:");
        double registeredMass = scanner.nextDouble();

        System.out.println("The planet " + registeredPLanet + " has a radius of " + registeredRadius + " km, and" +
                " a mass of " + registeredMass + " kg.");

        scanner.close();

    }

}


