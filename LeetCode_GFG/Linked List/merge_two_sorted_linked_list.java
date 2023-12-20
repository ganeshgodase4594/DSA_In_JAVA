
/*

Merge two sorted linked lists

Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 

Example 1:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.

Example 2:

Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two
linked list , we have 1, 1, 2, 4 as
output.

Your Task:
The task is to complete the function sortedMerge() which takes references to the heads of two linked lists as the arguments and returns the head of merged linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N, M <= 104
0 <= Node's data <= 105


 */

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     
        Node temp1=head1;
        Node temp2=head2;
        
        ArrayList<Integer> ls1=new ArrayList<>();
        ArrayList<Integer> ls2=new ArrayList<>();
        
        while(temp1!=null){
            ls1.add(temp1.data);
            temp1=temp1.next;
        }
        while(temp2!=null){
            ls2.add(temp2.data);
            temp2=temp2.next;
        }
        
        int arr1[]=new int[ls1.size()];
        int arr2[]=new int[ls2.size()];
        int arr3[]=new int[ls1.size()+ls2.size()];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=ls1.get(i);
        }
        
        for(int i=0;i<arr2.length;i++){
            arr2[i]=ls2.get(i);
        }
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        
        Node head3=null;
        Node temp=head3;
        
        for( i=0;i<arr3.length;i++){
            
            Node newNode=new Node(arr3[i]);
            
            if(head3==null){
                head3=newNode;
                temp=head3;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        return head3;
   } 
}
