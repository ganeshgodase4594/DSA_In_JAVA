
/*

Third largest element


Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.

Example 1:

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3

Example 2:

Input:
N = 2
A[] = {10,2}
Output: -1

Your Task:
Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105


 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    long max=Long.MIN_VALUE;
	    long secmax=Long.MIN_VALUE;
	    long thirdmax=Long.MIN_VALUE;
	    
	    if(n<3){
	        return -1;
	    }
	    
	    for(int i=0;i<a.length;i++){
	        
	        if(a[i]>max){
	            thirdmax=secmax;
	            secmax=max;
	            max=a[i];
	        }else if(a[i]>secmax && a[i]!=max){
	            thirdmax=secmax;
	            secmax=a[i];
	        }else if(a[i]>thirdmax && a[i]!=secmax && a[i]!=max){
	            
	            thirdmax=a[i];
	        }
	    }
	    return (int)thirdmax;
    }
}
