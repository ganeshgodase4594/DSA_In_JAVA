
import java.util.*;

class Solution {
    
    public boolean findTriplets(int arr[], int n) {
        
        if (n < 3) {
           
            return false;
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
           
            int left = i + 1;
           
            int right = n - 1;
           
            int currentElement = arr[i];

            while (left < right) {
               
                int sum = currentElement + arr[left] + arr[right];

                if (sum == 0) {
                 
                    return true;
                } else if (sum < 0) {
                 
                    left++;
                } else {
                 
                    right--;
                }
            }
        }
        return false;
    }
}