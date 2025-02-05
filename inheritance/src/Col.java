import java.util.ArrayList;
import java.util.Collections;

public class Col {
    static int max(ArrayList a){
        int max = 0;
        for(int i=0; i<a.size(); i++){
            if((int)a.get(i) > max){
                max = (int)a.get(i);
            }
        }
        return max;
    }
    static int min(ArrayList a){
        int min = 100;
        for(int i=0; i<a.size(); i++){
            if((int)a.get(i) < min){
                min = (int)a.get(i);
            }
        }
        return min;
    }
    static double median(ArrayList a){
        int l = a.size();
        Collections.sort(a);
        if(l%2 == 0) {
            return (double)((int) a.get(l / 2) + (int) a.get((l / 2) - 1)) / 2;
        }else{
            return (double)a.get(l/2);
        }
    }

    static double avg(ArrayList a){
        int sum = 0;
        for(int i=0; i<a.size(); i++){
            sum += (int)a.get(i);
        }
        return sum/a.size();
    }

    static void swap(ArrayList a, int n, int m){
        int temp = (int)a.get(n);
        a.add(n, (int)a.get(m));
        a.remove(n+1);
        a.add(m, temp);
        a.remove(m+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1; i<=10; i++){
            a.add(i);
        }
        System.out.println(a);
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(median(a));
        System.out.println(avg(a));
        swap(a, 0, 9);
        System.out.println(a);

    }
}
