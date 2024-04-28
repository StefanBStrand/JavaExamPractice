package Oblig1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bonus3_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean registering = true;

        List<Planet> planets = new ArrayList<>();

        while (registering) {

            System.out.println("What would you like to do? 1: Register planet. 2: List planets: " +
                    "3: Delete planet. 4: Update planet. 5. Quit");
            int decision = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (decision) {
                    case 1 -> {
                        try { // IMPORTANT TO PRACTICE TRY /CATCH BLOCKS!

                            System.out.println("Enter name of planet: ");
                            String planetName = scanner.nextLine();

                            System.out.println("Enter radius of planet: ");
                            double planetRadius = scanner.nextDouble();

                            scanner.nextLine(); //Eat empty line

                            System.out.println("Enter mass of planet: ");
                            double planetMass = scanner.nextDouble();

                            scanner.nextLine(); //eat empty line

                            Planet planet = new Planet(planetName, planetRadius, planetMass);
                            planets.add(planet);
                            System.out.println("Planet added successfully");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Enter numeric values for radius and mass, and text " +
                                    "for planet name");
                            scanner.nextLine(); // Consuming invalid input.
                        }
                    }


                    case 2 -> System.out.println(planets);

                    case 3 -> {
                        System.out.println("Which planet would you like to remove?: ");
                        String planetToDelete = scanner.nextLine();
                        planets.removeIf(planet -> planet.getName().equals(planetToDelete));
                        System.out.println("You have deleted the planet" + planetToDelete);
                    }

                    case 4 -> {
                        System.out.println("Which planet do you want to update?");
                        String planetToUpdate = scanner.nextLine();
                        boolean found = false;

                        for (Planet planet : planets) {
                            if (planet.getName().equals(planetToUpdate)) {
                                found = true;
                                try {
                                    System.out.println("Enter new name of planet:");
                                    String newName = scanner.nextLine();
                                    planet.setName(newName);

                                    System.out.println("Enter new radius of planet: ");
                                    double updatedRadius = scanner.nextDouble();
                                    scanner.nextLine(); // eat empty space
                                    planet.setRadius(updatedRadius);

                                    System.out.println("Enter new mass of planet");
                                    double updatedMass = scanner.nextDouble();
                                    scanner.nextLine();
                                    planet.setMass(updatedMass);
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input, please enter correct numeric values.");
                                }
                            }
                        }
                        if (!found) {
                            System.out.println("Planet not found, enter planet within the list.");
                        }
                    }
                    case 5 -> registering = false;
                }
            } catch (Exception e) {
                System.out.println("An error occured: " + e.getMessage());
            }
        }
    }
}


