
class Node{
    
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class LinkedList{

    Node head=null;

    void addFirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void reverselinkedlist(Node prev,Node current){

        if(current == null){
            head = prev;
            return;
        }

       Node forward = current.next;
        current.next = prev;
        prev = current;
        current = forward;


        reverselinkedlist(prev,current);
        
    }

    void printSLL(){
        if(head==null){
            System.out.println("Linked List Is Empty");
        }else{
            Node temp=head;

            while (temp!=null) {
                System.out.print(temp.data+ "->");
                temp=temp.next;
            }
            System.out.println();
        }
    }

}

class Client{

    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);

        ll.printSLL();

        Node prev=null;
        ll.reverselinkedlist(prev,ll.head);

        ll.printSLL();


    }
}