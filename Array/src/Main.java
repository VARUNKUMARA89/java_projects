import java.util.*;

public class Main {
    static boolean prime(int n){
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("size of the array:");
        int n = scn.nextInt();
        System.out.println("enter " + n + " elements.");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the k th largest element for which the nature of the element should be found:");
        int k = scn.nextInt();
        if(prime(arr[arr.length-k])){
            System.out.println("its a prime number");
        }else{
            System.out.println("its not a prime number");
        }


    }
}