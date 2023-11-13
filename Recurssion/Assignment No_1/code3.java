
// 3. WAP to print the sum of n natural numbers.

import java.util.Scanner;

class sum{

    static int sumofn(int num){
        if(num==0){
            return 0;
        }
        return num+sumofn(--num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter that a number that a perform addition");
        int num=sc.nextInt();


        int result=sumofn(num);
        System.out.println(result);
    }
}