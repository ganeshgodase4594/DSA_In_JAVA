
/*

kadenes algorithm

 */ 

 class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.

   static long maxSubarraySum(int arr[], int n){
        
        long summax=Integer.MIN_VALUE;
        long sum=0;
        
        for(int i=0;i<arr.length;i++){
            
            sum=sum+arr[i];
            
            if(sum>summax){
                
               summax=sum;
            }
            
            if(sum<0){
                
                sum=0;
            }
        }
        return summax;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,-2,5};

      System.out.println(maxSubarraySum(arr, 5)); 


    }
    
}
 