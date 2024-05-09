package ExamPractice2;
import java.util.ArrayList;

public class Route {

    private ArrayList<BusStop> busStops = new ArrayList<>();


    public double calculateRouteLength() {
        double totalDistance = 0;

        for (int i = 0; i < busStops.size() - 1; i++) {

            BusStop busStop1 = busStops.get(i);
            BusStop busStop2 = busStops.get(i+1);

            double distance = GPSService.distanceBetweenBusStops(busStop1, busStop2);
            totalDistance += distance;

        } return totalDistance;
    }
}
