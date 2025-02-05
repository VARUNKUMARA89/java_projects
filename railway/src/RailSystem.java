import java.util.Scanner;
import java.util.TreeMap;

class Train{
    String trainName, trainSource, trainDestination;
    int passengerStrength, currentPassengerStrength = 0, trainNumber;
    Passenger passenger;
    public Train(String trainName, int trainNumber, String trainSource, String trainDestination, int passengerStrength){
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.trainSource = trainSource;
        this.trainDestination = trainDestination;
        this.passengerStrength = passengerStrength;

    }
    void printTrainDetails(){
        System.out.println("Name: " + trainName);
        System.out.println("Number: " + trainNumber);
        System.out.println("Source: " + trainSource);
        System.out.println("Destination: " + trainDestination);
        System.out.println("Passenger strength : " + passengerStrength);
    }
}

class Passenger{
    String passengerName, passengerGender;
    int passengerAge;
    public Passenger(String passengerName, String passengerGender, int passengerAge){
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }
}
class Reservation{
    String sourceStation, destinationStation;
    Reservation(String sourceStation, String destinationStation){
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        for()
    }

}
public class RailSystem {
    public static void main(String[] args) {
        TreeMap<Integer, Train> TrainList = new TreeMap<>();
        TrainList.put(1001, new Train("Pandiyan Express", 1001, "Madurai", "Chennai", 800));
        TrainList.put(1002, new Train("Delhi Rajdhani", 1002, "Delhi", "Mumbai", 750));
        TrainList.put(1003, new Train("Kolkata Mail", 1003, "Chennai", "Kolkata", 700));
        TrainList.put(1004, new Train("Mumbai Local", 1004, "Thane", "Churchgate", 1200));
        TrainList.put(1005, new Train("Bangalore Shatabdi", 1005, "Mysuru", "Bangalore", 600));
        TrainList.put(1006, new Train("Hyderabad Express", 1006, "Chennai", "Hyderabad", 850));
        TrainList.put(1007, new Train("Jaipur Superfast", 1007, "Delhi", "Jaipur", 700));
        TrainList.put(1008, new Train("Ahmedabad Duronto", 1008, "Mumbai", "Ahmedabad", 500));
        TrainList.put(1009, new Train("Pune Intercity", 1009, "Mumbai", "Pune", 900));
        TrainList.put(1010, new Train("Guwahati Express", 1010, "Kolkata", "Guwahati", 600));
        TrainList.put(1011, new Train("Chandigarh Mail", 1011, "Delhi", "Chandigarh", 750));
        TrainList.put(1012, new Train("Trivandrum Express", 1012, "Chennai", "Trivandrum", 700));
        TrainList.put(1013, new Train("Lucknow Shatabdi", 1013, "Delhi", "Lucknow", 800));
        TrainList.put(1014, new Train("Bhopal Express", 1014, "Mumbai", "Bhopal", 650));
        TrainList.put(1015, new Train("Aurangabad Jan Shatabdi", 1015, "Pune", "Aurangabad", 550));
        TrainList.put(1016, new Train("Patna Rajdhani", 1016, "Kolkata", "Patna", 700));
        TrainList.put(1017, new Train("Amritsar Express", 1017, "Delhi", "Amritsar", 600));
        TrainList.put(1018, new Train("Ranchi Duronto", 1018, "Kolkata", "Ranchi", 500));
        TrainList.put(1019, new Train("Surat Superfast", 1019, "Mumbai", "Surat", 800));
        TrainList.put(1020, new Train("Goa Express", 1020, "Mumbai", "Goa", 700));


        Scanner scn = new Scanner(System.in);
        int choice = 1;
        while(choice != 5){
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Ticket");
            System.out.println("4. Display Train");
            System.out.println("5. Exit");
            choice = scn.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Enter the source station");
                    String sourceStation = scn.next();
                    System.out.println("Enter the destination station");
                    String destinationStation = scn.next();

                }
            }
        }
    }
}
