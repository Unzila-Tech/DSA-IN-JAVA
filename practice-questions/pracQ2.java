import java.util.Scanner;

public class pracQ2 {

    public static void oddSum(int n){
        int sum=0;
            for(int i=1;i<=n; i++){
                if((i%2)!=0){
                 sum=sum+i;
                }
            }
            System.out.println("sum of odd numbers:"+ sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        oddSum(n);
    }
}
