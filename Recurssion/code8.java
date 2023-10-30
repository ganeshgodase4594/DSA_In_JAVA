// recurssion....

class recurssion{
    static void fun(int num){
        if(num==0){
            return;

        }
        num=5+fun(--num);
        System.out.println(num);
    }
    public static void main(String[] args) {
        
        System.out.println("start main");
        fun(2);
        System.out.println("end main");
    }
}
// error....