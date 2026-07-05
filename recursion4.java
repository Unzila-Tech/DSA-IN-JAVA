public class recursion4 {
    
    public static void factorialNum(int i,int n,int product){
      
        if(i==n){
            product*=i;
            System.out.println("factorial of n numbers:"+product);
            return;
        }
      product*=i;
     factorialNum(i+1, n, product);
      
    }
    public static void main(String[] args) {
      
       factorialNum(1,4,1);
    }
}
