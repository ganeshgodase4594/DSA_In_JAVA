
/*

Problem 1:
Given an array containing n integers. The problem is to find the sum of the
elements of the contiguous subarray having the smallest(minimum) sum.
Examples:
Input : arr[] = {3, -4, 2, -3, -1, 7, -5}
Output : -6
Subarray is {-4, 2, -3, -1} = -6
Input : arr = {2, 6, 8, 1, 4}
Output : 1

 */


import java.util.ArrayList;

class Solution{

 static int sumofsubarray(int arr[],int n){

        int sum=0;

         int min=Integer.MAX_VALUE;

        ArrayList<Integer>ls=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

             sum=0;
            for(int j=i;j<arr.length;j++){

                sum=sum+arr[j];

                if(sum<min){

                    min=sum;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{3,-4,2,-3,-1,7,-5};

        System.out.println(sumofsubarray(arr,arr.length));
    }
}