public class Main {
    static String full_reverse(String a){
        int l = a.length();
        String b = "";
        for(int i=l-1; i>=0; i--){
            b = b + a.charAt(i);
        }
        return b;
    }

    static String string_reverse_1(String a){
        String b = full_reverse(a);
        String[] c = b.split(" ");
        int n = c.length;
        String d = "";
        for(int i=n-1; i>=0; i--){
            d += c[i] + " ";
        }
        return d;
    }

    static String string_reverse_2(String a){
        String[] b = a.split(" ");
        int n = b.length;
        String c = "";
        for(int i=n-1; i>=0; i--){
            c += b[i] + " ";
        }
        return c;

    }

    public static void main(String[] args) {
        String a = "Welcome to KCG";
        System.out.println(full_reverse(a));
        System.out.println(string_reverse_1(a));
        System.out.println(string_reverse_2(a));

    }
}