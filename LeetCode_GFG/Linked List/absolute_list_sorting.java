

/*

Absolute List Sorting

Given a linked list of N nodes, sorted in ascending order based on the absolute values of its data,i.e. negative values are considered as positive ones. Sort the linked list in ascending order according to the actual values, and consider negative numbers as negative and positive numbers as positive.


Example 1:

Input: 
List: 1, -2, -3, 4, -5
Output: 
List: -5, -3, -2, 1, 4
Explanation: 
Actual sorted order of {1, -2, -3, 4, -5}
is {-5, -3, -2, 1, 4}

 

Example 2:

Input: 
List: 5, -10
Output: 
List: -10, 5
Explanation:
Actual sorted order of {5, -10}
is {-10, 5}

 

Your Task:
You don't need to read or print anything. Your Task is to complete the function sortList() which takes the head of the Linked List as input parameter and sort the list in ascending order and return the head pointer of the sorted list.

 

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)


Constraints
1 ≤  N  ≤ 10^5
-10^5 ≤  node.data ≤ 10^5


 */

import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
 class Absolute_List_Sort
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head,PrintWriter out)
    {
        Node temp = head;
        while (temp != null)
        {
           out.print(temp.data+" ");
           temp = temp.next;
        }  
        out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
			head = node;
		else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}
    }
	  
    
    public static void main(String args[])throws IOException
    {
       
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        // Scanner sc = new Scanner(System.in);
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
// 		int t=sc.nextInt();
        int t=Integer.parseInt(in.readLine().trim());
		 
		while(t>0)
        {
// 			int n = sc.nextInt();
            int n=Integer.parseInt(in.readLine().trim());
			Absolute_List_Sort llist = new Absolute_List_Sort();
			//int n=Integer.parseInt(br.readLine());
// 			int a1=sc.nextInt();
            String s[]=in.readLine().trim().split(" ");
            int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
			Node temp=head;
            for (int i = 1; i < n; i++) 
			{
				// int a = sc.nextInt();
				int a=Integer.parseInt(s[i]);
				temp.next=new Node(a);
				temp=temp.next;
			}
          
            Solution gfgobj = new Solution(); 
    		llist.head = gfgobj.sortList(head);
    		llist.printList(llist.head,out);
		
			t--;
		}
		out.close();
	}
}


/* The structure of the node of the Linked List is
class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
*/

class Solution
{
	Node sortList(Node head) {
		
		Node temp=head;
		int count=0;
		while(temp!=null){
		    count++;
		    temp=temp.next;
		}
		int result[]=new int[count];
		
		temp=head;
		int i=0;
		while(temp!=null){
		    result[i]=temp.data;
		    temp=temp.next;
		    i++;
		}
		
		Arrays.sort(result);
		
		Node head1=null;
		temp=head1;
		
		for( i=0;i<result.length;i++){
		    
		    Node newNode=new Node(result[i]);
            
            if(head1==null){
                head1=newNode;
                temp=head1;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
		}
		return head1;
	}
}