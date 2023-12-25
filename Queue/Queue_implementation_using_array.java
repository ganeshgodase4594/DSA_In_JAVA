
// queue implementation using array....

import java.util.Scanner;

class Queue{

    int quearr[];
    int front;
    int rear;
    int maxsize;

    Queue(int size){

        this.quearr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.maxsize=size;
    }

    void enqueue(int data){

        if(rear==maxsize-1){
            System.out.println("queue is full");
            return;
        }

        if(front==-1){
            front=rear=0;
            quearr[rear]=data;
        }else{
            rear++;
            quearr[rear]=data;
        }
    }

    int dequeue(){

        if(front==-1){
          //  System.out.println("queue is empty");
            return -1;
        }else{

            int val=quearr[front];
            front++;

            if(front>rear)
                front=rear=-1;

            return val;
        }
    }

    boolean empty(){

        if(front==-1){
            // System.out.println("queue is empty");
            return true;
        }else{
            // System.out.println("queue is not empty");
            return false;
        }
    }

    int front(){

        if(front==-1){
           // System.out.println("queue is empty");
            return -1;
        }else{
            return quearr[front];
        }
    }

    int rear(){

        if(rear==-1){
           // System.out.println("queue is empty");
            return -1;
        }else{
            return quearr[rear];
        }
    }

    void printqueue(){

        System.out.println("print the queue");

        for(int i=front;i<=rear;i++){

            System.out.print(quearr[i]+" ");
        }
    }
}

class client{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int size=sc.nextInt();

        Queue q=new Queue(size);
        char ch;

        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.empty");
            System.out.println("4.front");
            System.out.println("5.rear");
            System.out.println("6.printQueue");

            System.out.println("enter the choice");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:{

                    System.out.println("enter the data");
                    int data=sc.nextInt();

                    q.enqueue(data);
                }
                   break;
            
                case 2:{

                    int val=q.dequeue();

                    if(val==-1){
                        System.out.println("queue is empty");
                    }else{
                        System.out.println("popped value is " + val);
                    }
                }
                 break;
                
                case 3:{

                    boolean val=q.empty();

                    if(val){
                        System.out.println("queue is empty");
                    }else{
                        System.out.println("queue is not empty");
                    }
                }

                break;

                case 4:{

                    int ret=q.front();

                    if(ret==-1){
                        System.out.println("queue is empty");
                    }else{
                        System.out.println("front = "+ret);
                    }
                }
                 break;

                case 5:{

                    int ret=q.rear();

                    if(ret==-1){
                        System.out.println("queue is empty");
                    }else{
                        System.out.println("rear = "+ret);
                    }
                }

                 break;

                case 6:{

                    q.printqueue();
                }

                break;
            
                default:
                    System.out.println("wrong choice !! enter correct choice");
                    break;
            }

            System.out.println("do you want to continue");
            ch=sc.next().charAt(0);
            
        } while (ch=='y' || ch=='Y');
    }
}