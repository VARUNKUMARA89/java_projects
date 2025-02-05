class Address{
    String country, city;
    void setAdd(String city, String country){
        this.city = city;
        this.country = country;
    }
    void getAdd(){
        System.out.println("city: " + city);
        System.out.println("country: " + country);
    }
}
class Bio_main{
    String name;
    int age;
    Address add;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

}

class Bio_work extends Bio_main{
    String occupation;
    int salary;
    String name;
    int age;
    Address add;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setOccupation(String occupation){
        this.occupation = occupation;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setAddress(Address add){
        this.add = add;
    }

    void getDetails(){
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("occupation: "+ occupation);
        System.out.println("salary: "+ salary);
        add.getAdd();
    }

}



public class Test1 {
    public static void main(String[] args) {
        Address add = new Address();
        add.setAdd("Chennai", "India");
        Bio_work p1 = new Bio_work();
        p1.setName("varun");
        p1.setAddress(add);
        p1.setAge(23);
        p1.setOccupation("senior developer");
        p1.setSalary(1000000);
        p1.getDetails();
    }
}
