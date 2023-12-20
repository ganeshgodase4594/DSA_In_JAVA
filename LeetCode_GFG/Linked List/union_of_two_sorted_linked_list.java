
/*

Union of Two Linked Lists
MediumAccuracy: 58.65%Submissions: 54K+Points: 4

Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  
banner

Given two linked lists, your task is to complete the function makeUnion(), that returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.

Example 1:

Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 
1 2 3 4 6 8 9
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output. 

Example 2:

Input:
L1 = 1->5->1->2->2->5
L2 = 4->5->6->7->1
Output: 
1 2 4 5 6 7
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output.

Your Task:
The task is to complete the function makeUnion() which makes the union of the given two lists and returns the head of the new list.

Expected Time Complexity: O((N+M)*Log(N+M))
Expected Auxiliary Space: O(N+M)

 */


import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    HashSet<Integer>hs1=new HashSet<>();
	    
	    TreeSet<Integer>hs2=new TreeSet<>();
	    
	   Node temp1=head1;
	   Node temp2=head2;
	   
	   while(temp1!=null){
	       hs2.add(temp1.data);
	       temp1=temp1.next;
	   }
	   while(temp2!=null){
	       hs2.add(temp2.data);
	       temp2=temp2.next;
	   }
	   
	   Node head=null;
	   Node temp=head;
	   for(int data:hs2){
	       
	       Node newNode=new Node(data);
	       
	       if(head==null){
	           head=newNode;
	           temp=head;
	       }else{
	           temp.next=newNode;
	           temp=newNode;
	       }
	   }
	   return head;
	}
}