public class Student {
    String name,college_name;
    int ID, max = 0;

//    Student(String name, String college_name, int ID){
//        this.name = name;
//        this.college_name = college_name;
//        this.ID = ID;
//        System.out.println("Welcome to the college");
//    }
    Student(){
        System.out.println("Welcome");
    }
    Student(String name){
        this.name = name;
    }
    Student(String name, String college_name){
        this(name);
        this.college_name = college_name;
    }
    Student(String name, String college_name, int ID){
        this(name, college_name);
        this.ID = ID;
    }
    Student(String name, String college_name, int ID, int ...a){
        this(name, college_name, ID);
        for(int i: a){
            max = (max>i) ? max:i;
        }
    }


    public static void main(String[] args) {
        Student s0 = new Student();
        Student s1 = new Student("varun", "KCG");
        Student s2 = new Student("kishore", "PSNA", 9);
//        Student s3 = new Student(90,89,67,100);
        System.out.println(s1.name + " " + s1.college_name + " " + s1.ID);
        System.out.println(s2.name + " " + s2.college_name + " " + s2.ID);
//        System.out.println(s3.max);

    }
}
