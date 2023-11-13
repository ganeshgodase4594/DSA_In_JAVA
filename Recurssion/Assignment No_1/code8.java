
// 8. WAP to count the occurrence of a specific digit in a given number.

class solution{
    static int count=0;
    static int digitoccurance(int num,int temp){
        if(num==0){
            return count;
        }
       if(temp==num%10){
        count++;
       }
       return digitoccurance(num/10, temp);
    }
    public static void main(String[] args) {
        int result=digitoccurance(458798845, 8);
        System.out.println(result);
    }
}