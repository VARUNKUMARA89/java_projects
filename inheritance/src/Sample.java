class Author{
    String name, from;
    int age;
    Author(String name, String from, int age){
        this.name = name;
        this.from = from;
        this.age = age;
    }
    void auth_print(){
        System.out.println("author name: " + name);
        System.out.println("from: " + from);
        System.out.println("age: " + age);

    }
}
class Book{
    String book_name;
    int published_year;
    Author a;
    Book(String book_name, int published_year, Author a){
        this.book_name = book_name;
        this.published_year = published_year;
        this.a = a;
    }

    void print(){
        System.out.println("book name: " + book_name);
        System.out.println("published year: " + published_year);
        a.auth_print();
    }

}


public class Sample {
    public static void main(String[] args) {
        Author a = new Author("Samuel Kim", "Japan", 91);
        Book atla = new Book("Avatar The Last Airbenber", 1998, a);

        atla.print();
//        int t = 0xab;
//        System.out.println(t);
    }
}
