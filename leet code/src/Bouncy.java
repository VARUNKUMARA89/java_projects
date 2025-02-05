public class Bouncy {
    static boolean de_reverse(int n){
        int m=n, rem = m%10;
        m = m/10;
        while(m != 0){
            if(m%10 < rem){
                return false;
            }else{
                rem = m%10;
                m = m/10;
            }
        }
        return true;
    }
    static boolean in_reverse(int n){
        int m=n, rem = m%10;
        m = m/10;
        while(m != 0){
            if(m%10 > rem){
                return false;
            }else{
                rem = m%10;
                m = m/10;
            }
        }
        return true;
    }
    public static void main (String[] args){
        int n = -101;
        System.out.println(!(de_reverse(n) || in_reverse(n)));
    }
}
