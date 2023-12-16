import java.util.Arrays;

class quicksortcode{

    int partition(int arr[],int start,int end){

        int pivot=arr[end];
        int i=start-1;

        for(int j=start;j<end;j++){

            if(arr[j]<=pivot){
                
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;

        return i+1;
    }

    void quicksort(int arr[],int start,int end){

        if(start<end){

            int pivotIndex=partition(arr,start,end);
            quicksort(arr, start, pivotIndex-1);
            quicksort(arr, pivotIndex+1, end);
        }
    }

    public static void main(String[] args) {
        
        int arr[]=new int[]{12,7,6,14,5,15,10};
        int start=0;
        int end=arr.length-1;

        quicksortcode obj=new quicksortcode();
        obj.quicksort(arr, start, end);

        System.out.println(Arrays.toString(arr));

    }
}
