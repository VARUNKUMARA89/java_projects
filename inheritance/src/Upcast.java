interface func{
    public void greet();
    public int add10(int a);
    public int mul10(int a);
}
abstract class Operation implements func{
    public void greet(){
        System.out.println("welcome");
    }
    public int add10(int a){
        return a+10;
    }
    public int mul10(int a){
        return a*10;
    }
}
class Op extends Operation{

}

public class Upcast {
    public static void main(String[] args) {
        Operation a = new Op();
        a.greet();
        System.out.println(a.add10(10));
        System.out.println(a.mul10(10));

    }
}
