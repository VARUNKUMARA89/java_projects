import java.util.Scanner;
class Result{
    private String name;
    private double cgpa;
//    private Result(String name, double cgpa){
//        this.name = name;
//        this.cgpa = cgpa;
//    }
    public void set_details(String name, double cgpa){
        this.name = name;
        this .cgpa = cgpa;
    }

    public void get_details(){
        System.out.println("name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}


public class Secure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Result[] ece = new Result[3];
        for(int i=0; i<3; i++){
            ece[i] = new Result();
            System.out.println("enter student "+ (i+1) + " details");
            double CGPA = scn.nextDouble();
            String name = scn.nextLine();
            ece[i].set_details(name, CGPA);
        }
        for(int i=0; i<3; i++){
            System.out.println("student "+ (i+1) + " details:");
            ece[i].get_details();
        }

    }
}
