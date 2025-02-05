public class Special {
    static StringBuilder special(StringBuilder a){
        int l = a.length();
        for(int i=0; i<l; i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 91 && a.charAt(i) >= 97 && a.charAt(i) <= 122 && a.charAt(i) >= 47 && a.charAt(i) <= 56) {
                continue;
            }else{
                a.deleteCharAt(i);
            }
        }
        return a;
    }
    public static void main (String[] args){
        StringBuilder a = new StringBuilder("hello$%#@ world");
        System.out.println(special(a));
    }
}
