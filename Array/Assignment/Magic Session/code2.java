

/*

Problem 2:
Given an array of non-negative integers representing a number, implement a function to
simulate the carry forward operation that occurs when adding 1 to the number represented by
the array. The array represents the digits of the number, where the 0th index is the least
significant digit. Your task is to handle the carry forward operation correctly, updating the array
accordingly. The function should return the resulting array.
For example, given the input array [1, 9, 9], representing the number 199, the function should
return [2, 0, 0], representing the result of adding 1 to 199 with the carry forward properly
handled.
Consider edge cases such as when the number has trailing zeros or when the carry forward
results in an additional digit. Optimize your solution for efficiency and discuss the time and
space complexity of your algorithm.

 */

 class solution{

    static int[] add1(int arr[]){

        String str="";

        for(int i=0;i<arr.length;i++){

            str=str+arr[i];
        }

        int no=Integer.parseInt(str);

        no++;

        int temp=no;

        int count=0;

        while(no!=0){

            count++;

            no=no/10;
        }

        no=temp;

       int arr1[]=new int[count];

        while (no > 0) {
       
            int rem = no % 10;
            
            count--;
            arr1[count] = rem;
             no = no / 10;
    }


        return arr1;

    }

    public static void main(String[] args) {
        
        int arr[]={1,9,9};

        int result[]=add1(arr);

        for(int i=0;i<result.length;i++){

            System.out.println(result[i]+" ");
        }
    }

 }