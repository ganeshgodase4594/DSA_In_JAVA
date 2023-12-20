
/*

Linked List that is Sorted Alternatingly
MediumAccuracy: 33.67%Submissions: 21K+Points: 4

Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  
banner

Given a Linked list of size N, the list is in alternating ascending and descending orders. Sort the given linked list in non-decreasing order.

 

Example 1:

Input:
LinkedList: 1->9->2->8->3->7
Output: 1 2 3 7 8 9
Explanation: After sorting the given
list will be 1-> 2-> 3-> 7-> 8-> 9.

 

Example 2:

Input:
LinkedList: 13->99->21->80->50
Output: 13 21 50 80 99
Explanation: After sorting the given list 
will be 13-> 21-> 50-> 80-> 99.

 

Your Task:
You do not need to read input or print anything. The task is to complete the function sort() which should sort the linked list in non-decreasing order. 

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 */


import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

/*
Structure of node class is:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
   public Node sort(Node head){
        
        ArrayList<Integer>ls=new ArrayList<>();
        
      Node temp=head;
        
        while(temp!=null){
            ls.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(ls);
        
        head=null;
	    temp=head;
	   for(int data:ls){
	       
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