
/*

find the difference between max and min value in array

 */

 class solution{

    static int diff(int arr[]){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }

            if(arr[i]<min){

                min=arr[i];
            }
        }

        return max+min;
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{-2,4,7,-1,8};

        int result=diff(arr);

        System.out.println("sum is max and min is "+ result);
    }
 }