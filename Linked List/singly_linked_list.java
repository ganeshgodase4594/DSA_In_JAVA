
import java.util.*;

// create the node ..

class Node{
    
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

// perform all operation....

class LinkedList{

    Node head=null;

    // 1.AddFirst

    void addFirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    // 2.AddLast

    void addLast(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;

            // or addFirst();
        }else{

            Node temp=head;

            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    // 3.countNode

    int countNode(){

        Node temp=head;
        int count=0;

        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }

    // 4.addAtPos

    void addAtPos(int pos,int data){

        if(pos<=0 || pos>=countNode()+2){

            System.out.println("wrong input");
            return;
        }

        if(pos==1){
            addFirst(data);
        }else if(pos==countNode()+1){
            addLast(data);
        }else{

            Node newNode=new Node(data);

            Node temp=head;

            while(pos-2!=0){
                temp=temp.next;
                pos--;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            
        }
    }

    // 5.delFirst

    void delFirst(){

        if(head==null){
            System.out.println("LinkedList Is Empty");
            return;
        }else if(countNode()==1){
            head=null;
        }else{
            head=head.next;
        }
    }
    // 6.delLast

    void delLast(){

        Node temp=head;
        if(head==null){
            System.out.println("LinkedList Is Empty");
            return;
        }else if(countNode()==1){
            head=null;
        }else{
           while(temp.next.next!=null){

                temp=temp.next;
           }
           temp.next=null;
        }
    }

    // 7.delAtPos

    void delAtPos(int pos){

        if(pos<=0 || pos>=countNode()+1){

            System.out.println("wrong input");
            return;
        }

        if(pos==1){
            delFirst();
        }else if(pos==countNode()){
            delLast();
        }else{

            Node temp=head;

            while(pos-2!=0){
                temp=temp.next;
                pos--;
            }
            temp.next=temp.next.next;
            
        }
    }

    // 8.print SLL

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
        
        char ch;

        do{
            System.out.println("Singly LikedList");
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
                    ll.addFirst(data);
                }
                 break;

                case 2: {

                    System.out.println("enter data");
                    int data=sc.nextInt();
                    ll.addLast(data);
                }
                 break;

                case 3: {

                    System.out.println("enter data");
                    int data=sc.nextInt();

                    System.out.println("enter pos");
                    int pos=sc.nextInt();
                    ll.addAtPos(pos, data);
                }
                 break;

                case 4: {

                    ll.delFirst();
                }
                 break;

                case 5: {

                    ll.delLast();
                }
                 break;

                case 6: {

                    System.out.println("enter pos");
                    int pos=sc.nextInt();
                    ll.delAtPos(pos);
                }
                 break;

                case 7: {

                   System.out.println("count "+ ll.countNode());
                }
                 break;

                case 8: {

                    ll.printSLL();
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