
/*

print all the elements in a given subarray from start to end....

 */

 class solution{

    static void printelement(int arr[],int start,int end){

        for(int i=start;i<=end;i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        int start=1;
        int end=5;

        printelement(arr, start, end);
    }
 }