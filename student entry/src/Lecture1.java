import java.util.Scanner;
import java.util.Stack;

public class Lecture1 {
    static boolean isValid(String s){
        Stack<Character> t = new Stack<>();
        for(char i: s.toCharArray()){
            if(i == '('){
                t.push(')');
            } else if (i == '{') {
                t.push('}');
            } else if (i == '[') {
                t.push(']');
            } else if (t.isEmpty() || t.pop() != i){
                return false;
            }
        }
        return t.isEmpty();
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        if(isValid(s)){
            System.out.println("it is valid");
        }else{
            System.out.println("it is not valid");
        }
    }
}
