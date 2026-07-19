package practice_questions;
import java.util.Scanner;

public class pracQ7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int positive=0;
        int negative=0;
        int zero=0;
        char choice;
        do{
            System.out.println("enter a number");
            num=sc.nextInt();
            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("do you want to continues y/n:");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
        System.out.println("positive:"+ positive);
        System.out.println("negative:"+ negative);
        System.out.println("zero:"+ zero);
        sc.close();
    }
}