public class Sample {
    static String reverse(String s){
        int l = s.length();
        String r = "";
        for(int i=l-1; i>=0; i--){
            r+=s.charAt(i);
        }
        return r;
    }
    public static void main (String[] args){
        String s = "Welcome to KCG";
        int l = s.length();
        String r = "";
        String result = "";
        for(int i=0; i<l; i++){
            if(s.charAt(i) != ' '){
                r += s.charAt(i);
            }else{
                result += reverse(r) + " ";
                r = "";
            }
        }
        result += reverse(r);
        System.out.println(reverse(s));
        System.out.println(result);
        System.out.println(reverse(result));


    }
}
