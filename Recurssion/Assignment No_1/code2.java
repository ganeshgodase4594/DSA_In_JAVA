

// 2. WAP to display the first 10 natural numbers in reverse order.

import java.util.Scanner;

class assignment1{

    static void printnumber(int num){
        if(num==0){
            return;
        }
        
        System.out.println(num);
        printnumber(--num);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number that you want to print");
        int num=sc.nextInt();
        printnumber(num);
    }
}