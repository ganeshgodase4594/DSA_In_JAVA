
/*

Modify Linked List-1

Given a singly linked list containing N nodes. Modify the Linked list as follows:

1. Modify the value of the first half nodes such that 1st node's new value is equal to the value of the last node minus the first node's current value, 2nd node's new value is equal to the second last nodes value minus 2nd nodes current value, likewise for first half nodes.
2. Replace the second half of nodes with the initial values of the first half nodes(values before modifying the nodes).
3. If N is odd then the value of the middle node remains unchanged.

Example 1:

Input:
N = 5
linked list = 10 -> 4 -> 5 -> 3 -> 6
Output:
-4 -1 5 4 10
Explanation:
For first half nodes modified list will be:
-4 -> -1 -> 5 -> 3 -> 6
For second half nodes modified list will be:
-4 -> -1 -> 5 -> 4 -> 10

Example 2:

Input:
N = 6
linked list = 2 -> 9 -> 8 -> 12 -> 7 -> 10
Output:
8 -2 4 8 9 2
Explanation:
After modifying the linked list as required,
we have a new linked list containing the elements as
8 -> -2 -> 4 -> 8 -> 9 -> 2.

YourTask:
The task is to complete the function modifyTheList() which should modify the list as required.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
-105  <= Node->data <= 105

 */


import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}

class Solution
{
    public static Node modifyTheList(Node head)
    {
         Node temp=head;
        int count=0;
        
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int arr[]=new int[count];
        int result[]=new int[count];
        
        temp=head;
        int num=0;
        
        while(temp!=null){
            arr[num]=temp.data;
            num++;
            temp=temp.next;
        }
        
        int start=0;
        int end=count-1;
        
        int mid=count/2;
        
         num=0;
        
        for(int i=0;i<arr.length/2;i++){
            
            result[num]=arr[end]-arr[num];
            
            end--;
            num++;
        }
        
        if(count%2==1){
            
            for(int i=mid;i>=0;i--){
                result[num]=arr[i];
                num++;
            }
        }else{
            
            for(int i=mid-1;i>=0;i--){
                result[num]=arr[i];
                num++;
            }
        }
        head=null;
        temp=head;
        
            for(int i=0;i<result.length;i++){
                
                Node newNode=new Node(result[i]);
                
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
}