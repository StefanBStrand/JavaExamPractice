package Oblig1;

import java.util.Scanner;

public class Bonus3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean registering = true;

        while (registering) {

            System.out.println("Enter planet name: ");
            String planetName = scanner.nextLine();

            System.out.println("Enter planet radius: ");
            double planetRadius = scanner.nextDouble();

            System.out.println("Enter planet mass: ");
            double planetMass = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Do you wish to continue registering planets? Answer yes or no: ");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                registering = false;
            }


        }
    }
}

