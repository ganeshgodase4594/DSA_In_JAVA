
import java.util.*;

class Node{

    Node prev=null;
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class DoublyLinkedList{

    Node head=null;

    //1.addFirst.

    void addFirst(int data){
    
    Node newNode =new Node(data);

     if(head==null)
        {
        head=newNode;
        }else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
    }

    //2.Print Dll

    void printDll(){

        Node temp=head;

        if(head==null){

            System.out.println("LinkedList Is Empty");
            return;
        }

        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    //3.addLast

    void addLast(int data){

        Node newNode=new Node(data);

        if(head==null){

            head=newNode;
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;

        }

    }

    //4.addAtPos

    void addAtPos(int pos,int data){

        Node newnNode=new Node(data);

       if(pos<=0 || pos>=countNode()+2){

            System.out.println("wrong Input");
            return;
       }
       if (pos==1) {
        addFirst(data);
       }else if (countNode()+1==pos) {
        addLast(data);
       }else{

        Node temp=head;

        while (pos-2!=0) {
            temp=temp.next;
            pos--;
        }
            newnNode.prev=temp;
            newnNode.next=temp.next;
            temp.next=newnNode;
            newnNode.next.prev=newnNode;
       }

    }

    //5.delFirst

    void delFirst(){

        if(head==null){
            System.out.println("Doubly Linked List Is Empty");
            return;
        }else if (countNode()==1) {
            head=null;
        }else{
            head=head.next;
            head.prev=null;
        }
    }

    // 6.delLast()

    void delLast(){

        if(head==null){
            System.out.println("Doubly Linked List Is Empty");
            return;
        }else if (countNode()==1) {
            head=null;
        }else{
            Node temp=head;

            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
        }
    }

    // 7.void delAtPos

    void delAtPos(int pos){

        if(pos<=0 || pos>=countNode()+1){

            System.out.println("wrong Input");
            return;
       }
       if (pos==1) {
        delFirst();
       }else if (countNode()==pos) {
        delLast();
       }else{

        Node temp=head;

        while (pos-2!=0) {
            temp=temp.next;
            pos--;
        }
            temp.next=temp.next.next;
            temp.next.prev=temp;
       }
    }

    // 8.count Node

    int countNode(){

         int count=0;
        if(head==null){
            return 0;
        }else{
            Node temp=head;

            while (temp!=null) {
                
                count++;
                temp=temp.next;
            }
        }
        return count;
    }

}

class Client{

    public static void main(String[] args) {
        
        DoublyLinkedList dll=new DoublyLinkedList();
        
        char ch;

        do{
            System.out.println("Doubly LikedList");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPos");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPos");
            System.out.println("7.countNode");
            System.out.println("8.printSLL");

            Scanner sc=new Scanner(System.in);

            System.out.println("enter your choice");
            int choice=sc.nextInt();

            switch (choice) {
                case 1: {

                    System.out.println("enter data");
                    int data=sc.nextInt();
                    dll.addFirst(data);
                }
                 break;

                case 2: {

                    System.out.println("enter data");
                    int data=sc.nextInt();
                    dll.addLast(data);
                }
                 break;

                case 3: {

                    System.out.println("enter data");
                    int data=sc.nextInt();

                    System.out.println("enter pos");
                    int pos=sc.nextInt();
                    dll.addAtPos(pos, data);
                }
                 break;

                case 4: {

                    dll.delFirst();
                }
                 break;

                case 5: {

                    dll.delLast();
                }
                 break;

                case 6: {

                    System.out.println("enter pos");
                    int pos=sc.nextInt();
                    dll.delAtPos(pos);
                }
                 break;

                case 7: {

                   System.out.println("count "+ dll.countNode());
                }
                 break;

                case 8: {

                    dll.printDll();
                }
                break;

                default:
                    System.out.println("wrong choice");
                    break;
            
            }
            System.out.println("do you want to continue");
            ch=sc.next().charAt(0);

        }while(ch=='Y' || ch=='y');
    
    }
}