
/*

find the element occurance in of given element....

 */

 


 class solution{

    static int maxoccurance(int arr[],int target){

        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{-2,4,7,-1,8,4,4,6,7};

        int target=15;

        int result=maxoccurance(arr,target);

        System.out.println("elements occur many time is "+ result);
    }
 }