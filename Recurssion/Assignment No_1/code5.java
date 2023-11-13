// 5. WAP to check whether the number is prime or not.

class solution{
    static int num1=1;
    static int count=0;
    static int checkprime(int num){

        if(num<=num1){
            return count;
        }
        if(num%num1==0){
            count++;
        }
        return checkprime(++num1);
       
    } 
    public static void main(String[] args) {
        
        
        int ret=checkprime(80);
        System.out.println(ret);
        if(ret==2){
            System.out.println("no is a prime number");
        }else{
            System.out.println("no is a not prime number");
        }
    }
}