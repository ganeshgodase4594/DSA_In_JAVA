
// selection sort using recurssion

class selectionsortrecurssion{
    static int num=0;
    static int min=Integer.MAX_VALUE;
    static void selection_recurssion(int arr[],int n){

        if(n==0){
            return;
        }
        int temp=arr[num];
        for(int i=num+1;i<n-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        selection_recurssion(arr, n);
    }
    public static void main(String[] args) {
        
        int arr[]=new int[]{3,2,5,4,8,7};
        int n=6;
        selection_recurssion(arr, n);
    }
}