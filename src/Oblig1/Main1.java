package Oblig1;

public class Main1 {

    //OBLIG 1 Oppgave 2.1
    public static void main(String[] args) {
        System.out.println("Hello World!");


        //Creating an instance of MoonGravity to be run here in main
        MoonGravity gravity = new MoonGravity();

        double earthWeight = 94; // My weight on earth
        // Assigning method call to Variable - STORING the RETURN value for later Use!
        double moonWeight = gravity.weightOnTheMoon(earthWeight);
        System.out.println("Weight on the Moon: " + String.format("%.2f", moonWeight)  + "kg.");

        // Direct method call WITHOUT assigning it to variable - data NOT POSSIBLE to USE LATER - Will not be stored.
        gravity.weightOnTheMoon(earthWeight);

    }
}