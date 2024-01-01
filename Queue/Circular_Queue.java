
// circular queue implementation using array....
// % is used for reminder is index...no array index out of bound....

import java.util.*;

class CircularQueue{

    int quearr[];
    int maxsize;
    int front;
    int rear;

    CircularQueue(int size){
        this.quearr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.maxsize=size;
    }

    void enqueue(int data){

        if((front==0 && rear==maxsize-1) || ((rear+1)%maxsize==front)){
            System.out.println("queue is full");
            return;
        }else if(front==-1){
            front=rear=0;
        }else if(rear==maxsize-1 && front!=0){
            rear=0;
        }else{
            rear++;
        }
        quearr[rear]=data;
    }

    int dequeue(){
        
        if(front==-1){
            System.out.println("queue is empty");
            return -1;
        }else{
            int ret=quearr[front];
            
            if(front==rear){
                rear=front=-1;
            }else if(front==maxsize-1 ){
                front=0;
            }else{
                front++;
            }
            return ret;
        }
        
    }
    void printcircularqueue(){

            if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(quearr[i]+" ");
                 }
            }else{
                for(int i=front;i<maxsize;i++){
                    System.out.print(quearr[i]+" ");
                 }

                 for(int i=0;i<=rear;i++){
                    System.out.print(quearr[i]+" ");
                 }
            }
            System.out.println();
        }
    }


class client{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int size=sc.nextInt();

        CircularQueue c=new CircularQueue(size);
        char ch;

        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.printcircularqueue");

            System.out.println("enter your choice");
            int choice=sc.nextInt();


            switch (choice) {
                case 1:{

                    System.out.println("enter data");
                    int data=sc.nextInt();

                    c.enqueue(data);
                }
                    break;

                case 2:{

                    int ret=c.dequeue();

                    if(ret!=-1){
                        System.out.println(ret+" popped");
                    }
                }
                    break;
                
                case 3:{

                    c.printcircularqueue();
                }
                break;
            
                default:

                System.out.println("wrong choice");
                    break;
            }

            System.out.println("do you want to continue");
             ch=sc.next().charAt(0);
            
        } while (ch=='y' || ch=='Y');
        
    }
}
