
/*

Problem 4:
Given an array of positive integers nums and a positive integer target, return the minimal length
of a
subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104

 */

 class solution{

    static int minimallength(int num[],int target){

        int min=Integer.MAX_VALUE;

        boolean flag=true;

        for(int i=0;i<num.length;i++){
            
            int sum=0;

            for(int j=i;j<num.length;j++){

                sum=sum+num[j];

               int length=j-i+1;

                if(sum>=target && length<min){

                    min=length;
                }

                if(sum>=target){

                    flag=false;
                }
            }
        }

        if(flag){

            return 0;
        }
        return min;
    }

    public static void main(String[] args) {
        
        int arr[]={1,1,1,1,1,1,1,1};
        int target=11;

        int result=minimallength(arr, target);

        System.out.println(result);
    }
 }