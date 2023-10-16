
/*

total no of subarray ....

 */

 class solution{

    static int totalsubarray(int arr[]){

        return arr.length*(arr.length+1)/2;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};

        System.out.println(totalsubarray(arr));
    }

 }

 