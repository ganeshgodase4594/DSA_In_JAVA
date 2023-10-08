
/*

3.range sum query

 */

class Solution {
	
	int[] rangeSumQuery(int nums[], int arr[][]) {
		
		int arr1[] = new int[arr.length];
		for(int i = 1; i < nums.length; i++) {
			
			nums[i] = nums[i] + nums[i - 1];
		}
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i][0] == 0) {
				
				arr1[i] = nums[arr[i][1]];

			} else {
				
				arr1[i] = nums[arr[i][1]] - nums[arr[i][0] - 1];
			}
		}
		return arr1;
	}
	public static void main(String[] args) {
		
		int nums[] = new int[]{1,2,3,4,5};

		int arr[][] = new int[][]{{0,3},{1,2}};

		int arr1[] = new Solution().rangeSumQuery(nums, arr);
        
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
		}
	}
}