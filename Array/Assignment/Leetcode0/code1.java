
/*

7. Reverse Integer
Medium
11.9K
13K
Companies

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

 

Constraints:

    -231 <= x <= 231 - 1



 */

 class Solution {
    static int reverse(int x) {
        
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        long rev=0;
        
        
        while(x!=0){

            int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }

        if(rev<min || rev>max){

            return 0;
        }else{

            return (int) rev;
        }

    }

    public static void main(String[] args) {
        
        int n=-123;

        int result=reverse(n);

        System.out.println("reverese number is "+ result);
    }
}