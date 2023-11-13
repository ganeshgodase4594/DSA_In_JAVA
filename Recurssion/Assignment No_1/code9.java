// 9. WAP to print string in reverse order.

class solution{

   static String reverse(String str){
        if(str==null || str.length()<=1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str="ganesh";
        String rev=reverse(str);
        System.out.println(rev);
    }
}