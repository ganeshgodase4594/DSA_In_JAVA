// 10. WAP to check whether the given number is palindrome or not.

class solution {

int sum = 0;

int reverse(int n, int temp) {

if (n == 0)
return temp;

temp = (temp * 10) + (n % 10);

return reverse(n / 10, temp);
}
public static void main(String[] args){
solution obj = new solution();
int num = 12321;
if(obj.reverse(num,0)==num){

System.out.println(num+" is Palindrome.");
}else{

System.out.println(num+" is Palindrome.");
}
}
}