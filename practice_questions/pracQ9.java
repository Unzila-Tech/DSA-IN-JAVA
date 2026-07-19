package practice_questions;
import java.util.Scanner;

public class pracQ9 {
    public static int gcd(int a,int b){
           while(b!=0){
              int temp=b;
              b=a%b;
              a=temp;
           }
           return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number A");
        int a= sc.nextInt();
        System.out.println("enter a number B");
        int b= sc.nextInt();
        gcd(a, b);
        sc.close();
    }
    
}
