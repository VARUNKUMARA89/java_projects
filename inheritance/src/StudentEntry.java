import java.util.Scanner;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    String name, department;
    int year, rollNumber;
    double percentage;
    Student(String name, int rollNumber, String department, int year, double percentage){
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.year = year;
        this.percentage = percentage;
    }
    void print(){
        System.out.println("name: " + name);
        System.out.println("roll number: " + rollNumber);
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
public class StudentEntry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TreeSet<Student> s = new TreeSet<>();

        int choice = 1;
        while(choice != 3){
            System.out.println("---------------------------------------");
            System.out.println("1. add student detail");
            System.out.println("2. print students detail");
            System.out.println("3. exit");
            choice = scn.nextInt();
            if(choice == 1){
                System.out.println("enter name, rollNumber, department, year, percentage: ");
                s.add(new Student(scn.next(), scn.nextInt(), scn.next(), scn.nextInt(), scn.nextDouble()));
            }else if(choice == 2){
                int c = 1;
                for(Student i : s){
                    System.out.println("-----------Student " + c + " details----------");
                    c++;
                    i.print();
                }
            }else{
                System.out.println("thank you!!!");
                return;
            }
        }
    }
}
