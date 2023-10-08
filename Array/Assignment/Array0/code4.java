

/*

time to equality....

 */


 class solution{

    static int equality(int arr[]){

        int max=Integer.MIN_VALUE;
       

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }

        }

        int sum=0;

        for(int i=0;i<arr.length;i++){

             sum=sum+(max-arr[i]);
        }
       return sum;
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{2,4,1,3,2};

        int result=equality(arr);

        System.out.println("required time is "+ result + " second");
    }
 }