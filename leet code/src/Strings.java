public class Strings {
    //    static StringBuilder str(StringBuilder s){
//        s.append(" universe");
//        s.replace(0,5,"hi");
//        s.insert(3, "hola ");
//        s.deleteCharAt(2).reverse();
//        return s;
//    }
    static boolean len(StringBuilder s) {
        return s.length() > 20;
    }


    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello world ");
        System.out.println(len(s));
//        StringBuilder t = str(s);
//        System.out.println(t);
//        System.out.println(t.length());
//        System.out.println(t.capacity());
//    }

    }
}