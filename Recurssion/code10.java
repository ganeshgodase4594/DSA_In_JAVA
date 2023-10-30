
class recurssion{

    void fun(int num){
        if(num==0){
            return;
        }
        System.out.println(num+" ");
        fun(--num);
    }
    public static void main(String[] args) {
        
        recurssion obj=new recurssion();
        obj.fun(2);
    }
}