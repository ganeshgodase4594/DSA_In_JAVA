
/*

Sort last M elements

Given an array nums of length n + m where first n elements are sorted. Your task is to sort the last m elements in-place so that the whole array becomes sorted.

Example 1:

Input: 
nums = {1, 3, 6, 19, 11, 16},
n = 3 
m = 3
Output: 
1, 3, 6, 11, 16, 19

Example 2:

Input: 
nums = {7, 8, 11} 
n = 2 
m = 1
Output: 
7, 8, 11

Your Task:
You don't need to read or print anything, Your task is to complete the function sortLastMelements() which takes nums, n and m as input parameters and sort nums in-place.

Expected Time Complexity: O(m * Log(m))
Expected Auxilary Space: O(m)

Constraints:
1 ≤ n, m ≤ 105
1 ≤ nums[i] ≤ 106

 */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String[] S = br.readLine().trim().split(" ");
            int[] nums = new int[n+m];
            for(int i = 0; i < S.length; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution obj = new Solution();
            obj.sortLastMelements(nums, n, m);
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}

class Solution
{
    public void sortLastMelements(int[] nums, int n, int m)
    {
        int s=0;
        int e=nums.length-1;
        
        merge(nums,s,e);
    }
    
    void merge(int arr[],int start,int end){
        
        if(start<end){
            
            int mid=start+(end-start)/2;
            
            merge(arr,start,mid);
            merge(arr,mid+1,end);
            mergesort(arr,start,mid,end);
        }
    }
    
    void mergesort(int arr[],int start,int mid,int end){
        
        int n1=mid-start+1;
        int n2=end-mid;
        
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            
            arr1[i]=arr[start+i];
        }
        
         for(int i=0;i<n2;i++){
            
            arr2[i]=arr[mid+i+1];
        }
        
        int i=0,j=0,k=start;

        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length) {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length) {
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
}