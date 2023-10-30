
// sum of digit using recurssion....

class sumofdigit{
   static int sum=0;
//    static int sumofdigitn(int num){
//         if(num==0){
//             return 0;
//         }
//          sum=(num%10)+sum;
//         sumofdigitn(num/10);
//         return sum;
//     }

    static int sumofdigitn(int num){
        if(num==0){
            return 0;
        } 
         return num%10+sumofdigitn(num/10);
    }

    public static void main(String[] args) {
        int ans=sumofdigitn(4567);
        System.out.println(ans);
    }
}