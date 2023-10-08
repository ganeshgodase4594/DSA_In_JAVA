
/*

product array puzzle....

 */

 class vishal{

    static void productarray(int arr[]){

        int mult=1;

        for(int i=0;i<arr.length;i++){

            mult=mult*arr[i];
        }

        for(int i=0;i<arr.length;i++){

            int temp=mult/arr[i];

            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5};
        
        productarray(arr);
    }
 }