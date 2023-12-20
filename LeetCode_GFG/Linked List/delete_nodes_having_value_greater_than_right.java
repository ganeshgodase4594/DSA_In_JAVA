
/*

Delete nodes having greater value on right

Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. (Not just immediate Right , but entire List on the Right)

Example 1:

Input:
LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.

Example 2:

Input:
LinkedList = 10->20->30->40->50->60
Output: 60
Explanation: All the nodes except the last
node has a greater value node on its right,
so all the nodes except the last node must
be removed.

Your Task:
The task is to complete the function compute() which should modify the list as required and return the head of the modified linked list. 
The printing is done by the driver code,

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ element of linked list ≤ 105

 */

import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


 class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}

/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        Node temp=head;
        
        ArrayList<Integer>ls=new ArrayList<>();
        
    
        while(temp!=null){
            
            ls.add(temp.data);
            temp=temp.next;
        }
        int max=Integer.MIN_VALUE;
        
        for(int i=ls.size()-1;i>=0;i--){
            
            if(ls.get(i)<max){
                ls.remove(i);
            }else{
                max=ls.get(i);
            }
        }
        
        // for(int i=0;i<ls.size();i++){
            
        //      System.out.print(ls.get(i)+ " ");
        //  }
        //  return head;
        
        Node head1=null;
         temp=head1;
        
        for(int data:ls){
            
            Node newNode=new Node(data);
            
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
  