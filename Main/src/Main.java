import java.util.*;

class Employee{
    String name;
    String designation;
    int salary;
    static String company = "Amazon";

    void employee_details(){
        System.out.println("name: "+ name);
        System.out.println("Designation: "+ designation);
        System.out.println("salary: "+ salary);
        System.out.println("company: "+ company);
    }
}


public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        for(int i=0; i<3; i++){
            System.out.println("Enter the employee details: " + (i+1));
            emp[i] = new Employee();
            emp[i].name = scn.next();
            emp[i].designation = scn.next();
            emp[i].salary = scn.nextInt();
        }
        Employee h;
        if(emp[0].salary > emp[1].salary && emp[0].salary > emp[2].salary){
            h = emp[0];
        }else if (emp[1].salary > emp[2].salary){
            h = emp[1];
        }else{
            h = emp[2];
        }
        h.employee_details();
    }
}