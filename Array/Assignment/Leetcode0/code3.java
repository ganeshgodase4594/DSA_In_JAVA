

class Solution {
    
    static int searchInsert(int[] nums, int target) {

   // boolean flag=false;
   
    int data=0;

     for(int i=0;i<nums.length;i++){

         if(nums[i]==target){

             return i;

         }else if(nums[i]<target){

             data=i;
         }
     }

     if(nums[0]>target){

         return 0;
     }

     return data+1;

    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4};
        int target=5;

       int result= searchInsert(arr, target);

        System.out.println(result+"");
        
    }
}
