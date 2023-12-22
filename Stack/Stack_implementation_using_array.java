
import java.util.*;

class Stack{

    int maxSize;
    int stackArr[];
    int top=-1;

    Stack(int size){

       this.maxSize=size;
       this.stackArr=new int[size];

    }

    void push(int data){

        if(top==maxSize-1){
            System.out.println("stack overflow");
        }else{
            top++;
            stackArr[top]=data;
        }
    }

    boolean empty(){

        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    int pop(){

        if(empty()){

            System.out.println("stack is underflow");
            return -1;
        }else{
            int val=stackArr[top];
            top--;
            return val;
        }
    }

    int peek(){

        if(empty()){

            System.out.println("stack is underflow");
            return -1;
        }else{
            return stackArr[top];
        }
    }

    int size(){

        return top;

    }

    void printStack(){

        if(empty()){
            System.out.println("stack is empty");
        }else{
            
            for(int val=0;val<=top;val++){
                System.out.print(stackArr[val]+" ");
            }
        }
    }
}

class Client{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your statck size");
        int size=sc.nextInt();

        Stack s=new Stack(size);
        char ch;

        do{

            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.empty");
            System.out.println("5.size");

            System.out.println("enter your choice");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:{

                    System.out.println("enter your stack elements");

                    int data=sc.nextInt();
                    s.push(data);
                }  
                    break;
                
                case 2:{

                    int val=s.pop();

                    if(val!=-1){
                        System.out.println("pop element is " + val);
                     }  
                }
                break;

                case 3:{

                    int peek=s.peek();

                    if(peek!=-1){
                        System.out.println("peek element is " + peek);
                     }  
                }
                break;

                case 4:{

                    boolean flag=s.empty();

                    if(flag){
                        System.out.println("stack is empty");
                     }else{
                        System.out.println("stack is not empty");
                     }  
                }
                break;

                case 5:{

                    int Size=s.size();

                        System.out.println("stack size is " + (Size+1)); 
                }
                break;

                case 6:
                    s.printStack();

                break;

                default:
                System.out.println("wrong choice");
                break;
            }
            System.out.println("do you want to continue ?");
            ch=sc.next().charAt(0);

        }while(ch=='y' || ch=='Y');
    }
}