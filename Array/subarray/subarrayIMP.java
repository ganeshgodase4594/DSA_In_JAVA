class Solution {

    static void maxSubarray(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
       
        int end = -1;

        int currentStart = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxSum) {
              
                maxSum = sum;
              
                start = currentStart;
              
                end = i;
            }

            if (sum < 0) {
                
                sum = 0;
                
                currentStart = i + 1;
            }
        }

        for (int i = start; i <= end; i++) {
           
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 5};

        maxSubarray(arr);
    }
}
