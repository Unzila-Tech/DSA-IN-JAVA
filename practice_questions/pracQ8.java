package practice_questions;
import java.util.Scanner;

public class pracQ8 {


    public static void powerOfNumber(int x,int n){
              double result= Math.pow(x, n);
              System.out.println("Power of X^n :"+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("enter the number of X");
        x=sc.nextInt();
         System.out.println("enter the number of N");
        n=sc.nextInt();
        powerOfNumber(x, n);
        sc.close();
    }
}
