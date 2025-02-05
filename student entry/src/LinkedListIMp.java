class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
class Llist{
    Node head;
    int size;
    Llist(){
        head = null;
        this.size = 0;
    }
    Llist(Node head, int size){
        this.head = head;
        this.size = size;
    }
    void get(int index){
        if(index < 0 || index > size){
            System.out.println("index out of bounds");
            return;
        }
        Node reference = head;
        for(int i=0; i<index; i++){
            reference = reference.next;
        }
        System.out.println(reference.data);
    }
    void addFirst(int a){
        Node n = new Node(a, head);
        head = n;
        size++;
    }
    void addLast(int a){
        Node n = new Node(a, null);
        if(head == null){
            head = n;
            size++;
        }
        Node reference = head;
        while(reference.next != null){
            reference = reference.next;
        }
        reference.next = n;
        size++;
    }
    void insert(int index, int a){
        if(index < 0 || index > size){
            System.out.println("index out of bounds");
            return ;
        }
        Node reference = head;
        for(int i=0; i<index-1; i++){
            reference = reference.next;
        }
        Node n = new Node(a, reference.next);
        reference.next = n;
        size++;
    }
    void display(){
        Node reference = head;
        while(reference.next != null){
            System.out.print(reference.data + " ");
            reference = reference.next;
        }
        System.out.println(reference.data);
    }
    void add(int a){
        Node n = new Node(a, null);
        if(head == null){
            head = n;
            size++;
            return;
        }
        Node refernce = head;
        while(refernce.next != null){
            refernce = refernce.next;
        }
        refernce.next = n;
        size++;
    }
    void getSize(){
        System.out.println(size);
    }
    void delete(int index){
        if(isEmpty()){
            System.out.println("no elemnts in the linked list");
        }else if(index < 0 || index > size){
            System.out.println("index out of bounds");
            return ;
        }
        Node reference = head;
        for(int i=0; i<index-1; i++){
            reference = reference.next;
        }
        reference.next = reference.next.next;
        size--;
    }
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    void deleteFirst(){
        Node ref = head;
        head = ref.next;
        ref = null;
        size--;
    }
    void deleteLast(){
        Node ref = head;
//        while(ref.next.next!=null)/*for(int i=0; i<size; i++)*/{
        for(int i=0; i<size-2; i++){
            ref = ref.next;
        }
        ref.next = null;
        size--;
    }
    void deleteMidElement(){
        int n = size/2;
        Node ref = head;
        for(int i=0; i<n-1; i++){
            ref = ref.next;
        }
        ref.next = ref.next.next;
        size--;
    }
    void reverse(){
        Node dummy = new Node(0, null);
        dummy.next = head;
        Node ref = dummy;
        while(ref.next != null){
            Node temp = ref.next;
            temp.next = ref;
            ref = temp;
//            temp = dummy.next;
        }
        head = ref;
    }
}

public class LinkedListIMp {
    public static void main(String[] args) {
        Llist l = new Llist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.reverse();
        l.display();

    }
}
