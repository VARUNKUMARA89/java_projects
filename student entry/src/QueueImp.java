import java.util.Scanner;
class Queue{
    int[] a;
    int n, top = -1;
    Queue(int n){
        this.n = n;
        a = new int[n];
    }
    boolean isEmpty(){
        return (top == -1);
    }
    boolean isFull(){
        return (top == n-1);
    }
    void enqueue(int n){
        if(isFull()){
            System.out.println("full");
            return;
        }
        a[++top] = n;
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        for(int i=0; i<top; i++){
            a[i] = a[i+1];
        }
        top--;
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}

public class QueueImp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = scn.nextInt();
        Queue q = new Queue(n);
        int choice = 1;
        while(choice != 4){
            System.out.println("1. enqueue | 2. dequeue | 3. display | 4. exit");
            choice = scn.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the element to be enqueued");
                    int m = scn.nextInt();
                    q.enqueue(m);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
