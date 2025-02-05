import java.util.*;

public class Example {
    static void calc(String a){
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i<a.length()){
            if(a.charAt(i) == '+'){
                int lval = 0;
                int rval = 0;
                int result;
                while(!s.empty()){
                    lval = lval * 10 + s.pop();
                }
                System.out.println(lval);
                while(a.charAt(i) != '+'){
                    int m = a.charAt(i) - '0';
                    rval = rval * 10 + m;
                    i++;
                }
                System.out.println(rval);
                result = lval + rval;
                s.push(result);
                System.out.println(result);
            }else{
                int n = Integer.parseInt(String.valueOf(a.charAt(i)));
                i++;
            }
        }
        System.out.println(s.pop());
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = "22+34+42";
        calc(a);
    }
}
