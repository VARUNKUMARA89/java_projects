import java.util.*;

public class Taxi{
    static int id = 1;
    int taxiId;
    int totalEarnings;
    int freeTime;
    char currentSpot;
    ArrayList<Passenger> bookings = new ArrayList<>();
    public Taxi(){
        totalEarnings = 0;
        freeTime = 6;
        currentSpot = 'A';
        taxiId = id++;
    }
}
