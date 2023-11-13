
// 7. WAP to find the factorial of a number.

class solution{
    static int fact=1;

    static int factorial(int num){
        if(num==0){
            return fact;
        }
        fact=fact*num;
        return factorial(--num);
    }
    public static void main(String[] args) {
      int result= factorial(5);
      System.out.println(result);
    }
}