public class Solution {
    static boolean regex(String s){
        int l = s.length();
        int[] n = new int[4];
        int j = 0;
        for(int i=0; i<l; i++){
            if(s.charAt(i) == '.'){
                n[j] = i;
                j++;
            }
        }
        n[3] = l;
        if(j==3){
            int start = 0;
            for(int i=0; i<4; i++){
                String t = s.substring(start,n[i]);
                int num = Integer.parseInt(t);
                start = n[i]+1;
                if(num>=0 && num<=255){
                    continue;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "23.45.12.56";
        System.out.println(regex(s));

    }
}
