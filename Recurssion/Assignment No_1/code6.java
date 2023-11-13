
// 6. WAP to calculate the sum of digits of a given positive integer.

class solution{
   static int sum=0;
    static int sumofdigit(int num){

        if(num<=0){
            return sum;
        }
         sum=num%10+sum;
         return sumofdigit(num/10);
    }
    public static void main(String[] args) {
       int result= sumofdigit(4587);
       System.out.println(result);
    }
}