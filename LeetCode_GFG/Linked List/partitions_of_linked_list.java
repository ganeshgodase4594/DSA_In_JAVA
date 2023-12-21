
/*

Partition a Linked List around a given value

Given a linked list and a value x, partition it such that all nodes less than x come first, then all nodes with value equal to x and finally nodes with value greater than x. The original relative order of the nodes in each of the three partitions should be preserved. The partition must work in-place.
 
Example 1:

Input:
1->4->3->2->5->2->3,
x = 3
Output:
1->2->2->3->3->4->5
Explanation: 
Nodes with value less than 3 come first, 
then equal to 3 and then greater than 3.

Example 2:

Input:
1->4->2->10 
x = 3
Output: 
1->2->4->10
Explanation:
Nodes with value less than 3 come first,
then equal to 3 and then greater than 3.

Your task:
You don't need to read input or print anything. Your task is to complete the function partition() which takes the head of the inked list and an integer x as input, and returns the head of the modified linked list after arranging the values according to x.
 
Expected time complexity : O(n)
Expected Auxiliary Space: O(n)
 
Constraints:
1 <= N <= 105
1 <= k <= 105


 */


import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}


/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        
        Node temp=node;
        int count=0;
        
        //LinkedList<Integer>ls=new LinkedList<>();
        ArrayList<Integer>ls=new ArrayList<>();
        
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int arr[]=new int[count];
        
        temp=node;
        int num=0;
        
        while(temp!=null){
            arr[num]=temp.data;
            num++;
            temp=temp.next;
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<x){
                ls.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==x){
                ls.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>x){
                ls.add(arr[i]);
            }
        }
        
        //Collections.sort(ls);
        
        node=null;
        temp=node;
        
        for(int data:ls){
            
            Node newNode=new Node(data);
                
                if(temp==null){
                    node=newNode;
                    temp=node;
                }else{
                    temp.next=newNode;
                    temp=newNode;
                }
            }
            return node;
        }
        
    }
