import java.util.*;


public class Main {
    static boolean identity(int[][] a, int m, int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == j && a[i][j] != 1){
                    return false;
                }
                if(j != i && a[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int m = scn.nextInt();
        System.out.println("enter the number of columns:");
        int n = scn.nextInt();
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++){
            System.out.println("enter the row " + (i+1) + " elements:");
            for(int j=0; j<n; j++){
                a[i][j] = scn.nextInt();
            }
        }


//upper triangle matrix
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                if(j>=i){
//                    System.out.print(a[i][j] + " ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println("");
//        }



//transpose matrix
//        for(int i=0; i<m; i++){
//            for(int j=i+1; j<n; j++){
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//        for(int i=0; i<m; i++){
//            for (int j=0; j < n; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }



//identity matrix block
//       System.out.println(identity(a, m, n));


//sparse matrix
        int c=0;
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0)
                    c+=1;
            }
        }
        int b=m*n;
        if((b/2)<c) System.out.println("The given array is sparse");
        else System.out.println("The given array is not sparse");
    }
}