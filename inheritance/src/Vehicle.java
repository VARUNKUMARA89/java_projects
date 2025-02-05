public class Vehicle{
    static class Vehicles{
        int number;
        String type;
        Vehicles() {
            System.out.println("this ia a vehicle.");
        }
        Vehicles(int number){
            this();
            this.number = number;
        }
        Vehicles(int number, String type){
            this(number);
            this.type = type;
        }
        void print(){
            System.out.println("number: " +  number);
            System.out.println("type: " + type);
        }
    }
    static class Bike extends Vehicles{
        int mileage;
        String brand;
        Bike(){
            System.out.println("this is a bike");
        }
        Bike(int mileage){
            this();
            this.mileage = mileage;
        }
        Bike(int mileage, String brand){
            this(mileage);
            this.brand = brand;
        }

        void print(){
            super.print();
            System.out.println("mileage: " + mileage);
            System.out.println("brand: " + brand);
        }
    }

    static class Cycle extends Vehicles{
        int Weight;
        String brand;
        Cycle(){
            System.out.println("this is a bike");
        }
        Cycle(int Weight){
            this();
            this.Weight = Weight;
        }
        Cycle(int Weight, String brand){
            this(Weight);
            this.brand = brand;
        }

        void print(){
            super.print();
            System.out.println("Weight: " + Weight);
            System.out.println("brand: " + brand);
        }
    }

    public static void main(String[] args) {
        Bike b = new Bike(45, "yamaha");
        b.number = 9160;
        b.type = "petrol";
        Cycle c = new Cycle(40, "Hercules");
        c.number = 1234;
        c.type = "pedalling";
        c.print();
        Main.Harrier h = new Main.Harrier(300, 2);

    }
}


