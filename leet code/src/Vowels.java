public class Vowels {
    static StringBuilder consonants(String s){
        StringBuilder a = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                a.append(s.charAt(i));
            }
        }
        return a;
    }
    public static void main (String[] args){
        String s = "varunkumara";
        System.out.println(consonants(s));
    }
}
