
/*

Leaders in array....

 */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); 
		
		while(t-->0){
		    
		   
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		   
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

class Solution{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> ls=new ArrayList<>();
        
        for(int i=0;i<arr.length-1;i++){
            
            boolean flag=false;
            
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]>=arr[j]){
                    
                    flag=true;
                    
                }else{
                    
                    flag=false;
                    
                    break;
                }
            }
            
            if(flag){
                
                ls.add(arr[i]);
            }
            
            
        }
        
        ls.add(arr[arr.length-1]);
        
        return ls;
    }
}
