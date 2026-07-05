public class recursion3 {

    public static void sumNatNum(int i,int n,int sum){
      
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
      sum+=i;
     sumNatNum(i+1, n, sum);
      
    }
    public static void main(String[] args) {
      
       sumNatNum(1,5,0);
    }
}
