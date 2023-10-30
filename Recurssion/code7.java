
// find error....

class recurssion{
    static int fun(int num){
        if(num==0){
            return 1;
        }
        num=5+fun(--num);
        System.out.println(num);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
// error: missing return statement....
