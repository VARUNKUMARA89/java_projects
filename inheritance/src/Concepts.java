class Number{
    void get(){
        System.out.println("this is number");
    }
    int multiply(int a, int b){
        return a*b;
    }
    float multiply(float a, float b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }
}
class Nums extends Number{
    void get(){
        System.out.println("this is nums");
    }
    int multiply(int a, int b){
        return a*b*10;
    }
    float multiply(float a, float b){
        return a*b*10;
    }
    double multiply(double a, double b){
        return a*b*10;
    }
}


public class Concepts {
    public static void main(String[] args) {
        Number n = new Number();
        double f = n.multiply(2.987,3.65);
        System.out.println(f);
//        Nums m = new Nums();
//        int j = m.multiply(2,6);
//        System.out.println(j);
        n.get();
//        m.get();
        n = new Nums();
        n.get();

    }
}
