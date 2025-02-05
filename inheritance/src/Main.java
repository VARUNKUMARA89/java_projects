public class Main {
    static class Car{
        String transmission, type;
        Car(){
            System.out.println("car");
        }
        Car(String transmission){
            this.transmission = transmission;
        }
        Car(String transmission, String Type){
            this(transmission);
            this.type = type;
        }
        void print(){
            System.out.println("transmission: " + transmission);
            System.out.println("car_type: " + type);
        }
        static void kishore(){
            System.out.println("good boy");
        }

    }
    static class Tata extends Car{
        String fuel_type, condition;
        Tata(){
            System.out.println("Tata");
        }
        Tata(String fuel_type){
            this.fuel_type = fuel_type;
        }
        Tata(String fuel_type, String condition){
            this(fuel_type);
            this.condition = condition;
        }
        void print(){
            super.print();
            System.out.println("fuel_type: " + fuel_type);
            System.out.println("condition: " + condition);
        }
    }
    static class Punch extends Tata{
        int hp, mileage;
        Punch(){
            System.out.println("Punch");
        }
        Punch(int hp){
            this.hp = hp;
        }
        Punch(int hp, int mileage){
            this(hp);
            this.mileage = mileage;
        }
        void print(){
            super.print();
            System.out.println("hp: " + hp);
            System.out.println("mileage: " + mileage);
        }

        static void kishore(){
            System.out.println("bad boy");
        }

    }
    static class Harrier extends Punch{
        int speed, capacity;
        Harrier(){
            System.out.println("Harrier");
        }
        Harrier(int speed){
            this();
            this.speed = speed;
        }
        Harrier(int speed, int capacity){
            this(speed);
            this.capacity = capacity;
        }
        void print(){
            super.print();
            System.out.println("speed: " + speed);
            System.out.println("capacity: " + capacity);
        }
        static void kishore(){
            System.out.println("play boy");
        }
    }

    public static void main(String[] args) {
        Harrier h = new Harrier(300, 2);
//        h.transmission = "manual";
//        h.type = "combustion";
//        h.fuel_type = "petrol";
//        h.condition = "off-road";
//        h.hp = 10000;
//        h.mileage = 10;
//        h.print();
        h.kishore();
    }

}
