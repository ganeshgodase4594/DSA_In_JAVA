
// 4. WAP to print the length of digits in a number.

class solution{
  static int count=0;
    static int lengthofdigits(int num){

        while(num<=0){
            return 0;
        }
        count++;
        lengthofdigits(num/10);
        return count;

    }
    public static void main(String[] args) {
        int result=lengthofdigits(5487);
        System.out.println(result);
    }
}