
/*

code 5:approach 3:using prfix sum....

 */

 class solution{

    static void prefixsubarray(int arr[]){

        int prfixsum[]=new int[arr.length];

        prfixsum[0]=arr[0];

        for(int i=1;i<arr.length;i++){

            prfixsum[i]=prfixsum[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                if(i==0){

                    System.out.println(prfixsum[j]+" ");
                }else{

                    System.out.println(prfixsum[j]-prfixsum[i-1]);
                }
            }
        }

    }

    public static void main(String[] args) {
        
        int arr[]={2,4,1,3};

        prefixsubarray(arr);
    }
 }