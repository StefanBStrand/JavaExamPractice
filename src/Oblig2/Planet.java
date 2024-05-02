package Oblig2;

public class Planet {
    private String name;

    private double radius;

    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    //REMEMBER - SETTERS are VOID - they do not RETURN ANYTHING
    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    // USING the toString method here to override - so that planet OBJECTS are written out in an understandable way!
    @Override
    public String toString() {
        return "Planet name: " + getName() + ", Planet radius: " + getRadius() + " km. Planet mass: " + getMass() +
                " kg.";
    }

}
