import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 0, 2, 1, 2, 0, 1, 1, 2};
        int l = arr.length;
        int mid = 0, low = 0, high = l-1;
        while(mid <= high){
            if(arr[mid] == 1)
                mid++;
            else if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int i=0; i<l; i++){
            System.out.print(arr[i] + " ");
        }

    }


}