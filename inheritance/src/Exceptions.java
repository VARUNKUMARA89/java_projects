import java.util.*;
class NegativeExceptionError extends Exception{
    public NegativeExceptionError(String s){
        super(s);
    }
}

public class Exceptions {
    static double divide(int a, int b){
           return a/b;
    }

    public static void main(String[] args)throws NegativeExceptionError, InputMismatchException, ArithmeticException {
        Scanner scn = new Scanner(System.in);
        System.out.println("welcome");
        try{
            try{
                int a = scn.nextInt();
                int b = scn.nextInt();
                if(a<0 || b<0){
                    throw new NegativeExceptionError("number is negative");
                }
                System.out.println(divide(a, b));
            }catch(InputMismatchException e){
                System.out.println("invalid input");
            }
            catch(NegativeExceptionError e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println("denominator cannot be 0");
        }finally{
            System.out.println("come again");
        }
        System.out.println("thank you");
    }

}
