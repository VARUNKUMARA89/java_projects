public class Passenger {
    static int pId = 1;
    String name;
    char pickupPoint, dropPoint;
    int pickupTime;
    int allocatedTaxiId;
    int amount;
    public Passenger(String name, char pickupPoint, char dropPoint, int pickupTime){
        this.name = name;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
        allocatedTaxiId = -1;
        amount = -1;
    }
}
