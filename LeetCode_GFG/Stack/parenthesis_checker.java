
/*

Parenthesis Checker

Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.

Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.

Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.

Your Task:
This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.

Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 32000

 */

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}

class Solution
{
    
    static boolean ispar(String x)
    {   
        Stack<Character>s=new Stack<>();
        
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            
            if(ch=='['|| ch=='{' || ch=='('){
                s.push(ch);
            }else{
                
                if(!s.empty()){
                   
                   char top=(char)s.peek();
                   
                   if(top=='[' && ch==']' || top=='{' && ch=='}' || top=='(' && ch==')'){
                       
                       s.pop();
                   }else{
                       return false;
                   }
                    
                }else{
                    return false;
                }
            }
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }
}
