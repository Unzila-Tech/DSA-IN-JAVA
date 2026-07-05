public class recursion5 {
    public static void fibonaciNum(int a,int b,int n){
       if(n==0){
        return;
       }
       System.out.print(a+" ");
       fibonaciNum(b, a+b, n-1);
    }
    public static void main(String[] args) {
        fibonaciNum(0, 1, 10);
    }
}
