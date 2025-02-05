import java.util.*;

public class Main
{
    static boolean palindrome(int n){
        int reverse=0, rem, m=n;
        while(m!=0){
            rem = m % 10;
            reverse = reverse * 10 + rem;
            m /= 10;
        }
        return (n == reverse);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println(palindrome(n));
    }
}
