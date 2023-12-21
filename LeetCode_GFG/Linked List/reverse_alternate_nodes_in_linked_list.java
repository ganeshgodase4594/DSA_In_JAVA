
/*

Reverse alternate nodes in Link List.

Given a linked list, you have to perform the following task:

    Extract the alternative nodes starting from second node.
    Reverse the extracted list.
    Append the extracted list at the end of the original list.

Note: Try to solve the problem without using any extra memory.

Example 1:

Input:
LinkedList = 10->4->9->1->3->5->9->4
Output: 
10 9 3 9 4 5 1 4
Explanation: 
Alternative nodes in the given linked list are 4,1,5,4. Reversing the alternative nodes from the given list, and then appending them to the end of the list results in a list 10->9->3->9->4->5->1->4.

Example 2:

Input:
LinkedList = 1->2->3->4->5
Output: 
1 3 5 4 2 
Explanation:
Alternative nodes in the given linked list are 2 and 4. Reversing the alternative nodes from the given list, and then appending them to the end of the list results in a list 1->3->5->4->2.

Your Task:
You don't have to read input or print anything. Your task is to complete the function rearrange() which takes the head of the linked list as input and rearranges the list as required.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
0 <= Node_value <= 109

 */

import java.util.*;
import java.lang.*;

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

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        Node temp=odd;
        int i=1;
        
        ArrayList<Node>ls=new ArrayList<>();
        ArrayList<Node>ls1=new ArrayList<>();
        
        while(temp!=null){
            
            if(i%2==1){
                ls.add(temp);
            }else{
                ls1.add(temp);
            }
            temp=temp.next;
            i++;
        }
        
        for( i=ls1.size()-1;i>=0;i--){
            ls.add(ls1.get(i));
        }
        
        // System.out.println(ls);
        
        odd=null;
        Node temp1=odd;
        
        for(Node node:ls){
            
            Node newNode=node;
            newNode.next = null;
            
            if(odd==null){
                odd=newNode;
                temp=odd;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
        }
    }
}
