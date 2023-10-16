
/*

print the total sum of subarray

 */

 class solution{

    static int totalsum(int arr[]){

        int totalsum1=0;

        for(int i=0;i<arr.length;i++){

            int sum=0;

            for(int j=i;j<arr.length;j++){

                sum=sum+arr[j];

                totalsum1=totalsum1+sum;
            }
        }

        return totalsum1;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3};

        System.out.println(totalsum(arr));
    }
 }