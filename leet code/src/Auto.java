public class Auto {
    static boolean automorphic(int n){
        if(n==0){
            return false;
        }else{
            int s = n*n;
            while(n != 0){
                if(n%10 == s%10){
                    n = n / 10;
                    s = s / 10;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args){
        int n = 0;
        System.out.println(automorphic(n));
    }
}
