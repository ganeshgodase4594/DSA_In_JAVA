
/*

print total count of subarray without using formula....

 */

 class solution{

    static int countsubarray(int arr[]){

        int count=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};

        System.out.println(countsubarray(arr));
    }
 }