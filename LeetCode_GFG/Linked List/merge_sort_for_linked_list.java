

/*

Merge Sort for Linked List

Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.

Example 1:

Input:
N = 5
value[]  = {3,5,2,4,1}
Output: 1 2 3 4 5
Explanation: After sorting the given
linked list, the resultant matrix
will be 1->2->3->4->5.

Example 2:

Input:
N = 3
value[]  = {9,15,0}
Output: 0 9 15
Explanation: After sorting the given
linked list , resultant will be
0->9->15.

Your Task:
For C++ and Python: The task is to complete the function mergeSort() which sort the linked list using merge sort function.
For Java: The task is to complete the function mergeSort() and return the node which can be used to print the sorted linked list.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105

 */


import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        Node temp=head;
        int count=0;
        
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int arr[]=new int[count];
        
        temp=head;
        int num=0;
        
        while(temp!=null){
            arr[num]=temp.data;
            num++;
            temp=temp.next;
        }
        
        int start=0;
        int end=arr.length-1;
        
        mergesort(arr,start,end);
        
        head=null;
        temp=head;
        
            for(int i=0;i<arr.length;i++){
                
                Node newNode=new Node(arr[i]);
                
                if(temp==null){
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=newNode;
                }
            }
            return head;
    }
    
   static void mergesort(int arr[],int start,int end){
            
            if(start<end){
                
                int mid=start+(end-start)/2;
                
                mergesort(arr,start,mid);
                mergesort(arr,mid+1,end);
                merge(arr,start,mid,end);
            }
        }
        
     static void merge(int arr[],int start,int mid,int end){
            
            int n1=mid-start+1;
            int n2=end-mid;
            
            int arr1[]=new int[n1];
            int arr2[]=new int[n2];
            
            for(int i=0;i<n1;i++){
                arr1[i]=arr[start+i];
            }
            
            for(int i=0;i<n2;i++){
                arr2[i]=arr[mid+1+i];
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

     


