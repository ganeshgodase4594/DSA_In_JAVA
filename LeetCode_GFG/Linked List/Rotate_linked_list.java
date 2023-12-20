
/*

Rotate a Linked List

Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Example 1:

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7

Example 2:

Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4


Your Task:
You don't need to read input or print anything. Your task is to complete the function rotate() which takes a head reference as the first argument and k as the second argument, and returns the head of the rotated linked list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= k <= N


 */

import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        
        int count=0;
        Node temp1=head;
        
        ArrayList<Integer>ls=new ArrayList<>();
        
        while(temp1!=null){
            if(count>=k){
                ls.add(temp1.data);
            }
            count++;
            temp1=temp1.next;
        }
        
        temp1=head;
        count=0;
        
        while(temp1!=null){
            if(count<k){
                ls.add(temp1.data);
            }
            count++;
            temp1=temp1.next;
        }
        // for(int i=0;i<ls.size();i++){
            
        //     System.out.print(ls.get(i)+ " ");
        // }
        
        Node head1=null;
        Node temp=head1;
        
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
