import java.util.*;

public class Main {
    static int totalTaxis = 4;
    static ArrayList<Taxi> taxiList = new ArrayList<>(totalTaxis);
    public static void mBook(Passenger p){
        ArrayList<Taxi> freeTaxis = new ArrayList<>();
        for(int i=0; i<totalTaxis; i++){
            if(taxiList.get(i).freeTime < p.pickupTime && p.pickupTime-taxiList.get(i).freeTime >= (taxiList.get(i).currentSpot - '0')-(p.pickupPoint - '0')){
                freeTaxis.add(taxiList.get(i));
            }
        }
        if(freeTaxis.isEmpty()){
            System.out.println("Taxi Booking Rejected\nNo Taxi Available");
        }else{
            System.out.println("Taxi can be Allotted");
            Booking book = new Booking();
            book.bookTaxi(freeTaxis, p.pickupPoint, p.dropPoint, p.pickupTime);
        }
    }
    public static void main(String[] args) {
        for(int i=0; i<totalTaxis; i++) {
            taxiList.add(new Taxi());
        }
        Scanner scn = new Scanner(System.in);
        Boolean b = true;
        while(b){
            System.out.println("1. Book Taxi\n2. Taxi Details\n3. Exit");
            int choice = scn.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("Enter name, P-point, D-point, P-time");
                    String name = scn.next();
                    char pickupPoint = scn.next().charAt(0);
                    char dropPoint = scn.next().charAt(0);
                    int pickupTime = scn.nextInt();
                    Passenger p = new Passenger(name, pickupPoint, dropPoint, pickupTime);
                    mBook(p);
                }
                break;
            }

        }
    }
}