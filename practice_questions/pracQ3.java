package practice_questions;
import java.util.Scanner;

public class pracQ3 {


    public static void  greatestNum(int num1,int num2){
                if(num1>num2){
                    System.out.println("Num 1 are greater" +num1);
                }
                else{
                    System.out.println("num 2 are greater"+num2);
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
         int num1= sc.nextInt();
         int num2=sc.nextInt();
        greatestNum(num1, num2);
        sc.close();
    }
}
