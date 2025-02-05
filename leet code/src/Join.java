public class Join {
    static String join(String c, String ...a){
        String b = "";
        for(String i: a){
            b = b + i + c;
        }
        return b;
    }

    static boolean palindrome(StringBuffer s){
        String t;
        t = String.valueOf(s.reverse());
        return (s.equals(t));
    }
    public static void main(String[] args){
//        System.out.println(join(" ", "hello", "world"));

        StringBuffer s = new StringBuffer("aaa");
        System.out.println(palindrome(s));

    }
}
