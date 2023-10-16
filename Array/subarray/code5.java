
/*

given an array of size n

print the sum of every  single subarray

 */

 // approach 1

 class solution{

    static void singlesum(int arr[]){

        for(int i=0;i<arr.length;i++){

            int sum=0;

            for(int j=i;j<arr.length;j++){

                sum=sum+arr[j];
                
                System.out.println(sum+" ");
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]={2,4,1,3};

        singlesum(arr);
    }
 }