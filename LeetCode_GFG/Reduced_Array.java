import java.util.*;

class Solution {
    static void convert(int[] arr, int n) {
        
         int result[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }  
      
        Arrays.sort(result);
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(result[i],i);
        }
        for(int i=0;i<n;i++){
            arr[i]=hm.get(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
    }