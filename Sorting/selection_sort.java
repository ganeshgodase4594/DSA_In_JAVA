// selection sort....

class selectionsort{

    public static void main(String[] args) {
        
        int arr[]=new int[]{9,2,7,3,8,4,1,6};

        for(int i=0;i<arr.length-1;i++){
            int minIndx=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndx]){
                    minIndx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndx];
            arr[minIndx]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}