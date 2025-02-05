import java.util.Scanner;

public class zoho1 {
    static int sum(int n){
        int sum = 0;
        for(int i=1; i<n+1; i++){
            sum += i;
        }
        return sum;
    }
    static void tri(int n){
        for(int j=1; j<=n; j++){
            for(int i=1; i<=j; i++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print(i + "+");
                }
            }
            int sum = sum(j);
            System.out.println("=" + sum);
        }

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        tri(n);
    }
}
