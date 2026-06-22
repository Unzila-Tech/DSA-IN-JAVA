import java.util.Scanner;

public class pracQ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number (n)");
        int n=sc.nextInt();
        int num1=0,num2=1;
       int i,next;

       for( i=1; i<=n; i++){
          System.out.println(num1);
          next=num1+num2;
          num1=num2;
          num2=next;
       }
       
    }
}
