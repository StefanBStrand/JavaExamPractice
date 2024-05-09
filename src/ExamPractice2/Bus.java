package ExamPractice2;

public class Bus {

    private String id;

    private String modelName;

    private int maxCapacity;

    private Route route;

    private TicketAuthenticator ticketAuthenticator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bus(String id, String modelName, int maxCapacity, Route route, TicketAuthenticator ticketAuthenticator) {
        this.id = id;
        this.modelName = modelName;
        this.maxCapacity = maxCapacity;
        this.route = route;
        this.ticketAuthenticator = ticketAuthenticator;
    }

    public Bus(String id, String modelName, int maxCapacity) {
        this.id = id;
        this.modelName = modelName;
        this.maxCapacity = maxCapacity;
        this.route = new Route();
        this.ticketAuthenticator = new TicketAuthenticator();
    }

    @Override
    public String toString() {
        return "Bus model: " + modelName + ", Number of seats: " + maxCapacity;
    }
}
