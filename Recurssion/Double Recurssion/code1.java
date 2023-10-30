
class doublerecurssion{

    static void fun(int num){
        if(num<=1){
            return;
        }
        fun(num-2);
        System.out.println(num);
        fun(num-1);
    }
    public static void main(String[] args) {
        
        fun(5);
    }
}