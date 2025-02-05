class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class CList{
    Node head = null;
    int size = 0;
    void add(int a){
        size++;
        Node n = new Node(a);
        if(head == null){
            head = n;
            head.next = head;
        }else{
            Node ref = head;
            while(ref.next != head){
                ref = ref.next;
            }
            n.next = head;
            ref.next = n;
        }
    }
    void display(){
        Node ref = head;
        while(ref.next != head){
            System.out.print(ref.data + " ");
            ref = ref.next;
        }
        System.out.println(ref.data);
    }
    void getHead(){
        System.out.println(head.data);
    }
    void addFirst(int a){
        size++;
        Node n = new Node(a);
        if(head == null){
            head = n;
            head.next = head;
        }else{
            Node ref = head;
            while(ref.next != head){
                ref = ref.next;
            }
            n.next = head;
            ref.next = n;
            head = n;
        }
    }
    void delete(){
        if(head == null){
            System.out.println("list is empty");
        }else{
            size--;
            Node ref = head;
            while(ref.next.next != head){
                ref = ref.next;
            }
            ref.next = head;
        }
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }else{
            Node ref = head;
            while(ref.next != head){
                ref = ref.next;
            }
            ref.next = head.next;
            head = head.next;
        }
    }
    void insert(int index, int a){
        if(index == 0){
            addFirst(a);
            return;
        }else if(index+1 > size){
            System.out.println("index out of bounds");
            return;
        }
        size++;
        Node n = new Node(a);
        Node dummy = new Node(0);
        dummy.next = head;
        Node ref = dummy;
        for(int i=0; i<index; i++){
            ref = ref.next;
        }
        n.next = ref.next;
        ref.next = n;
    }
    void remove(int index){
        if(index == 0){
            head = null;
            return;
        }else if(index+1 > size){
            System.out.println("index out of bounds");
            return;
        }
        Node ref = head;
        for(int i=0; i<index-1; i++){
            ref = ref.next;
        }
        ref.next = ref.next.next;
    }
    void getSize(){
        System.out.println(size);
    }
    void removeElement(int a){
        if(head.data == a){
            Node ref = head;
            while(ref.next != head){
                ref = ref.next;
            }
            ref.next = ref.next.next;
            head = head.next;
            size--;
        }else{
            Node ref = head;
            while(ref.next.data != a){
                ref = ref.next;
                if(ref == head){
                    System.out.println("enter a valid element");
                    return;
                }
            }
            ref.next = ref.next.next;
            size--;
        }
    }
}


public class SingleCircular {
    public static void main(String[] args) {
        CList c = new CList();
        for(int i=1; i<11; i++){
            c.add(i);
        }
        c.removeElement(2);
        c.display();
        c.getSize();
    }
}