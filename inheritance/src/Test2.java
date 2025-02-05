import java.util.Scanner;

class Stack{
    int[] arr;
    int size, top = -1;
    Stack(int size){
        this.size = size;
        arr = new int[size];
    }
    boolean isEmpty(){
        return (top == -1);
    }
    boolean isFull(){
        return (top == size-1);
    }
    void push(int n){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = n;
    }
    void peek(){
        System.out.println(arr[top]);
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    void search(int n){
        for(int i=0; i<=top; i++){
            if(arr[i] == n){
                System.out.println(top-i+1);
                return;
            }
        }
        System.out.println("element not found");
    }
    void getSize(){
        System.out.println(top+1);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = scn.nextInt();
        Stack s = new Stack(n);
        int choice = 1;
        while(choice != 7){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. display");
            System.out.println("5. search");
            System.out.println("6. getSize");
            System.out.println("7. exit");
            choice = scn.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the element to be pushed");
                    int m = scn.nextInt();
                    s.push(m);
                    break;
                case 2:
                    System.out.println("element poped is: " + s.pop());
                    break;
                case 3:
                    System.out.print("top element in the stack is: ");
                    s.peek();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("elements in the stack");
                    s.display();
                    break;
                case 5:
                    System.out.println("enter the element to be searched: ");
                    int j = scn.nextInt();
                    System.out.print("element is found at the index: ");
                    s.search(j);
                    break;
                case 6:
                    System.out.print("size of the stack is: ");
                    s.getSize();
                    break;
                case 7:
                    System.out.println("*****Thank you*****");
                    return;
            }
        }
    }
}
