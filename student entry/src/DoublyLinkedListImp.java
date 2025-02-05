class Mode{
    Mode prev, next;
    int data;
    Mode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class Dlist{
    Mode head = null, tail = null;
    int size = 0;
    void add(int a){
        Mode n = new Mode(a);
        if(head == null){
            head = n;
            tail = n;
        }else{
            size++;
            n.prev = tail;
            tail.next = n;
            tail = tail.next;
        }
    }
    void display(){
        Mode ref = head;
        while(ref.next != null){
            System.out.print(ref.data + " ");
            ref = ref.next;
        }
        System.out.println(ref.data);
    }
    void displayHead(){
        System.out.println(head.data);
    }
    void displayTail(){
        System.out.println(tail.data);
    }
    void delete(){
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void addFirst(int a){
        Mode n = new Mode(a);
        if(head == null){
            head = n;
            tail = n;
        }else{
            size++;
            head.prev = n;
            n.next = head;
            head = head.prev;
        }
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("empty list");
        }else{
            size--;
            head = head.next;
            head.prev = null;
        }
    }
    void getSize(){
        System.out.println(size);
    }
    void insert(int index, int a){
        Mode n = new Mode(a);
        if(index > size){
            System.out.println("index out of bounds");
        }else{
            size++;
            Mode ref = head;
            for(int i=0; i<index-1; i++){
                ref = ref.next;
            }
            n.next = ref.next;
            ref.next.prev = n;
            ref.next = n;
            n.prev = ref;
        }
    }
    void remove(int index){
        if(head == null){
            System.out.println("index out of bounds");
        }else{
            size--;
            Mode ref = head;
            for(int i=1; i<index-1; i++){
                ref = ref.next;
            }
            ref.next = ref.next.next;
            ref.next.prev = ref;
        }
    }
    void displayReverse(){
        Mode ref = tail;
        while(ref.prev != null){
            System.out.print(ref.data + " ");
            ref = ref.prev;
        }
        System.out.println(ref.data);
    }
    void removeElement(int a){
        if(tail.data == a){
            this.delete();
        }
        Mode dummy = new Mode(0);
        dummy.next = head;
        head.prev = dummy;
        Mode ref = dummy;
        while(ref.next != tail){
            if(ref.next.data == a){
                ref.next = ref.next.next;
                ref.next.prev = ref;
            }else{
                ref = ref.next;
            }
        }
        head = dummy.next;
        size--;
    }
}
public class DoublyLinkedListImp {
    public static void main(String[] args) {
        Dlist d = new Dlist();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.display();
        d.removeElement(3);
        d.add(100);
        d.insert(0, 10);

        d.display();
    }
}
