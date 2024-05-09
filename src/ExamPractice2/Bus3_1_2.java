package ExamPractice2;

public class Bus3_1_2  extends CollectiveTransportUnit {

    private String modelName;

    private Route route;

    private TicketAuthenticator ticketAuthenticator;


    public Bus3_1_2(String id, String modelName, int maxCapacity, Route route, TicketAuthenticator ticketAuthenticator) {
        super(id, maxCapacity);
        this.modelName = modelName;
        this.route = route;
        this.ticketAuthenticator = ticketAuthenticator;
    }

    public Bus3_1_2(String id, String modelName, int maxCapacity) {
        super(id, maxCapacity);
        this.modelName = modelName;
        this.route = new Route();
        this.ticketAuthenticator = new TicketAuthenticator();
    }

    @Override
    public String toString() {
        return "Bus model: " + modelName + ", Number of seats: " + getMaxCapacity;
    }
}

