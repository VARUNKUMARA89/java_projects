import java.util.*;

public class Booking {
    public void bookTaxi(List<Taxi> freeTaxis, char pickupPoint, char dropPoint, int pickupTime){
        int min = 10;
        ArrayList<Integer> minDistance = new ArrayList<>();
        for(Taxi t: freeTaxis){
            char currentSpot = t.currentSpot;
            int distance = Math.abs((pickupPoint - '0') - (currentSpot - '0'));
            minDistance.add(distance);
            if(distance < min){
                min = distance;
            }
        }
        int index = minDistance.indexOf(min);
        Taxi allottedTaxi = freeTaxis.get(index);

    }
}
