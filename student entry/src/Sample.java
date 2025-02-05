import java.util.Map;
import java.util.TreeMap;

class Book{
    String name, genre;
    double price;
    public Book(String name, String genre, double price){
        this.name = name;
        this.genre = genre;
        this.price = price;
    }
    void printBookDetails(){
        System.out.println("---book details---");
        System.out.println("name: " + name);
        System.out.println("genre: " + genre);
        System.out.println("price: " + price);
    }
}

class Author implements Comparable<Author>{
    String name, from;
    int age;
    public Author(String name, String from, int age){
        this.name = name;
        this.from = from;
        this.age = age;
    }
    void printAuthorDetails(){

        System.out.println("---Author details---");
        System.out.println("Author: " + name);
        System.out.println("from: " + from);
        System.out.println("age: " + age);
    }
    public int compareTo(Author b){
        return this.name.compareToIgnoreCase(b.name);
    }
}

public class Sample {
    public static void main(String[] args) {
        TreeMap<Author, Book> b = new TreeMap<>();
        b.put(new Author("kishore", "madurai", 20), new Book("naan oru thevidiya", "gaaju", 150));
        b.put(new Author("varun", "chennai", 20), new Book("how to be perfect", "self-motivation", 1500));
        b.put(new Author("ajay", "delhi", 20), new Book("white man", "novel", 1000));
        b.put(new Author("siva", "tirunelveli", 20), new Book("oombuvadhu epdi", "gaaju", 100));
        int c = 1;
        for(Map.Entry<Author, Book> i : b.entrySet()){
            System.out.println("------------BOOK " + c + " DETAILS------------");
            i.getKey().printAuthorDetails();
            i.getValue().printBookDetails();
            c++;
        }
    }
}
