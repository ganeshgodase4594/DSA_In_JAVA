
/*

Example 9
Given a sorted array arr containing n elements with possibly some duplicate, the task is to find
the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Example 1:
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:
2 5
Explanation:
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
Example 2:
Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:
6 6
Explanation:
First and last occurrence of 7 is at index 6.

 */

 import java.util.*;

 class solution
{
   static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> ls=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(x==arr[i]){
                
                ls.add((long)(i));
                
                break;
            }
        }
        
        for(int i=arr.length-1;i>=0;i--){
            
            if(arr[i]==x){
                
                ls.add((long)(i));
                
                break;
            }
        }
        
        if(ls.size()==2){
            
            return ls;
        }else{
            
            ls.add((long)(-1));
            ls.add((long)(-1));
        }
        
        return ls;
    }

    public static void main(String[] args) {
        
        long arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };

        ArrayList<Long>ls=find(arr, 9, 7);

        System.out.println(ls);
    }

}
