
import java.util.*;

 class ganesh
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        LinkedHashSet<Integer>ls1=new LinkedHashSet<>();
         LinkedHashSet<Integer>ls2=new LinkedHashSet<>();
        
        for(int i=0;i<A.length;i++){
            ls.add(A[i]);
        }
        for(int i=0;i<B.length;i++){
            if(ls.contains(B[i])){
                ls1.add(B[i]);
            }
        }
        for(int i=0;i<C.length;i++){
            if(ls1.contains(C[i]) ){
                ls2.add(C[i]);
            }
        }
      //  LinkedLinkedHashSet<Integer>hs=new LinkedLinkedHashSet<>(ls2);
        
        ArrayList<Integer>ls3=new ArrayList<>(ls2);
        
        return ls3;
    }
}