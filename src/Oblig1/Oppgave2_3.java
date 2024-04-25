package Oblig1;

import java.util.ArrayList;
import java.util.List;

public class Oppgave2_3 {
    public static void main(String[] args) {

        ArrayList<Planet> planets = new ArrayList<>();

        Planet mercury = new Planet("Mercury", 2.4397e3, 3.3011e23);
        Planet venus = new Planet("Venus", 6.0518e3, 4.8675e24);
        Planet earth = new Planet("Earth", 6.371e3, 5.97237e24);
        Planet mars = new Planet("Mars", 3.3895e3, 6.4171e23);

        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);

        for (Planet planet : planets) {
            System.out.println("Planet " + planet.getName() + " has a radius of " + planet.getRadius() + " km, " +
                    "and a mass of " + planet.getMass() + "kg.");
        }

        // PRACTICING getting PLanets from LIST! Getting a single index here:
        Planet firstPlanet = planets.get(0); //Could also be called with planets.getFirst.
        System.out.println("First planet in the list: " + firstPlanet);

        //Using a loop to get multiple planets!
        List<Planet> firstThreePlanets = new ArrayList<>();
        int[] indices = {0, 1, 2};
        for (int index : indices) {
            firstThreePlanets.add(planets.get(index));
        }

        System.out.println(firstThreePlanets);

        // Easier way to get multiple planets without loop and new list:
        List<Planet> firstThreeElements = planets.subList(0, 3);
        System.out.println(firstThreeElements);



    }
}
