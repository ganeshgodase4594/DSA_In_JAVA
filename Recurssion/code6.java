
// solution of code 5

class recurssion{

    static int fun(int num){
        if(num==0){
            return 1;
        }
        return 5+fun(--num);
    }
    public static void main(String[] args) {
     int result=fun(2);
     System.out.println(result);
    }
}