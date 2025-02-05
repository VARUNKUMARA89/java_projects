interface emp{
    void greet();
    int highest_salary();
    int lowest_salary();
    double avg_salary();
}
interface employees extends emp{
    void thank();
}
class Employee implements employees{
    @Override
    public void greet() {
        System.out.println("hello");
    }
    public int highest_salary(){
        return 10000;
    }
    public int lowest_salary(){
        return 100;
    }
    public double avg_salary(){
        return 1000;
    }
    public void thank(){
        System.out.println("thank you");
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.greet();
        a.thank();
    }
}
