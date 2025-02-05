import java.util.Arrays;
import java.util.Scanner;

public class Sum1 {
    static void rot(int[] a, int n){
        int temp = a[0];
        for(int i=1; i<n; i++){
            a[i-1] = a[i];
        }
        a[n-1] = temp;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = (2*i)+1;
        }
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(a));
            rot(a, n);
        }

    }
}
