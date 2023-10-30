// solution

class recurssion{

    static int fun(int num){
        if(num==1){
            return 1;
        }
        return fun(--num)+3;
    }
    public static void main(String[] args) {
     int result=fun(2);
     System.out.println(result);
    }
}