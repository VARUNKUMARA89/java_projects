public class Odd {
//    static int[] odd(int n){
//        int[] a = new int[n/2];
//        for(int i=0; i<n/2; i++){
//                a[i] = 2*i + 1;
//        }
//        return a;
//    }

    static boolean[] odd(int n){
        boolean[] a = new boolean[n];
        for(int i=1; i<n; i++){
            a[i] = (i%2 != 0);
        }
        return a;
    }

    public static void main (String[] args){
        int n = 10;
        boolean[] arr = odd(n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
