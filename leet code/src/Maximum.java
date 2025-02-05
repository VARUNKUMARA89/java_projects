public class Maximum {
    static int max(int ...a){
        int m = 0;
        for(int i: a){
           m = i>m ? i : m;
        }
        return m;
    }
    public static void main(String[] args){
        System.out.println(max(1,2,3,4,5));
    }
}
