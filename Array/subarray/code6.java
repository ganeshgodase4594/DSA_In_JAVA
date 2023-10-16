
/*

code 5: approach 2

 */

 class solution{

    static void printsum(int arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                int sum=0;

                for(int k=i;k<=j;k++){

                    sum=sum+arr[k];

                }

                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]={2,4,1,3};

        printsum(arr);
    }
 }