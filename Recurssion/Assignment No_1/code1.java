
// 1. WAP to print the numbers between 1 to 10.

import java.util.Scanner;

class assignment1{

    static void printnumber(int num){
        if(num==1){
            return;
        }
        printnumber(--num);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number that you want to print");
        int num=sc.nextInt();
        printnumber(num);
    }
}