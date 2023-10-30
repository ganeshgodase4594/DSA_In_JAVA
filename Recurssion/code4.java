// sum of n;

class sum{

    static int sumofn(int num){
        if(num==0){
            return 0;
        }
        return num+sumofn(--num);
    }
    public static void main(String[] args) {
        int result=sumofn(10);
        System.out.println(result);
    }
}