
// recurssion....

class recurssion{
    static void fun(int num){
        if(num==0){
            return;
        }
        fun(--num);
        System.out.println(num);
    }
    public static void main(String[] args) {
        fun(2);
    }
}