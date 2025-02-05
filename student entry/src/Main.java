import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Student implements Comparable<Student>{
    String name, department;
    int year, rollNumber;
    double percentage;
    Student(String name, String department, int year, double percentage){
        this.name = name;
        this.department = department;
        this.year = year;
        this.percentage = percentage;
    }
    void print(){
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("year: " + year);
        System.out.println("percentage: " + percentage + "%");
    }
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
//        if(this.percentage < s.percentage){
//            return -1;
//        }else if(this.percentage == s.percentage){
//            return 0;
//        }else{
//            return 1;
//        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TreeMap<Integer, Student> s = new TreeMap<>();

        int choice = 1;
        while(choice != 4){
            System.out.println("---------------------------------------");
            System.out.println("1. add student detail");
            System.out.println("2. print all students detail");
            System.out.println("3. get details of a student");
            System.out.println("4. exit");
            choice = scn.nextInt();
            if(choice == 1){
                System.out.println("enter  rollNumber, name, department, year, percentage: ");
                try{
                    s.put(scn.nextInt(), new Student(scn.next(), scn.next(), scn.nextInt(), scn.nextDouble()));
                }catch(InputMismatchException e){
                    System.out.println("give data in the correct order");
                    choice = 1;
                }
            }else if(choice == 2){
                int c = 1;
                for(Map.Entry<Integer, Student> i : s.entrySet()){
                    System.out.println("-----------Student " + c + " details----------");
                    c++;
                    i.getValue().print();
                    System.out.println("roll number: " +i.getKey() );
                }
            }else if(choice == 3){
                try{
                    System.out.println("enter the roll number of the student to fetch the details:");
                    Integer n = scn.nextInt();
                    Student i = s.get(n);
                    i.print();
                    System.out.println("roll number: " + n);
                }catch(NullPointerException e){
                    System.out.println("give a valid roll number that already exist in the database.");
                    choice = 3;
                }

            }else{
                System.out.println("Thank you!!!");
                return;
            }
        }
    }
}
