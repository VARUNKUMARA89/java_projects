import java.util.*;



public class Main {

    static Map<Customer, Event> admins = new HashMap<>();
//    static Map<Customer, Event> users = new HashMap<>();
    static public void eventDetails(Customer c){
        int eventId;
        if(c.customerId == 1){
            Event e = admins.get(c);
            System.out.println("event name: " + e.eventName);
            eventId = 1;
        }else{
            Event f = admins.get(c);
            System.out.println("event name: " + f.eventName);
            eventId = 2;
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "varun", "abc@gmail.com", 91509);
        Customer c2 = new Customer(2, "mani", "cdf@gmail.com", 19123);
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        Event e1 = new Event(1, "concoert", "music", "30/5/2025", 1000);
        Event e2 = new Event(2, "Tenet", "movie", "14/2/2025", 250);

        admins.put(c1, e1);
        admins.put(c2, e2);



        Scanner scn = new Scanner(System.in);
        Boolean b = true;
        System.out.println("enter the user ID");
        int userId = scn.nextInt();
        eventDetails(customers.get(userId-1));
        while(b){
            System.out.println("1. update event\n2. search");
            int choice = scn.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("enter new event name, category, date, capacity");
                    String eventName = scn.next();
                    String category = scn.next();
                    String date = scn.next();
                    int capacity = scn.nextInt();
                     = eventName;
                    eventDetails(customers.get(userId-1));

                }
            }
        }

    }
}